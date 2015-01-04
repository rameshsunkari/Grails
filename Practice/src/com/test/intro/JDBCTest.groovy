package com.test.intro

import groovy.sql.Sql

class JDBCTest {

	static main(args) {
		def foo = 'cheese'
		def sql = Sql.newInstance("jdbc:mysql://localhost:3306/groovytest", "testuser",
							  "testuser", "com.mysql.jdbc.Driver")
		
		sql.eachRow('show tables'){ row ->
			println row[0]
		}
		
		def id=9
		def firstName = 'user'+id
		def lastName = "test"+id
		sql.execute("insert into person (id,first_name, last_name) values (${id}, ${firstName}, ${lastName})")
		
		sql.eachRow( 'select * from person' ) { println "$it.id -- ${it.first_name} --${it.last_name}" }
		sql.eachRow('select * from person' ) {
			row -> println row
		}
		
		def answer = 0
		sql.eachRow("select count(*) from person") { row ->
			answer = row[0]
		}
		
		println 'count ='+answer
		
	}

}
