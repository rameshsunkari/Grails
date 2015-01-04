package com.test.sql

import groovy.sql.Sql
import groovy.xml.MarkupBuilder

class TestSQL {

	static main(args) {
		def schema = 'groovytest'
		def sql = Sql.newInstance("jdbc:mysql://localhost:3306/$schema", "testuser",
				"testuser", "com.mysql.jdbc.Driver")

		/* Request */
		def req = """
				SELECT id,first_name,last_name FROM ${schema}.person
		"""
		def out = new File('/home/user/Ramesh/Learning/Grails/Sample/xmlOutput.xml')
		def writer = new FileWriter( out )
		def xml = new MarkupBuilder( writer )

		xml.agents {
			sql.eachRow( req as String  ) { /* For each row output detail */ row ->
				xml.agent(id:row.id) {
					firstname( row.first_name )
					lastname( row.last_name )
				}
			}
		}
	}
}
