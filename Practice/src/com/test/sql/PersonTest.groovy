package com.test.sql

import groovy.sql.Sql

class PersonTest {
	static def sql = Sql.newInstance("jdbc:mysql://localhost:3306/groovytest", "testuser",
		"testuser", "com.mysql.jdbc.Driver")

	static main(args) {
		println getPersons()
		
	}
	
	static def getPersons() {
		def persons = []
		sql.eachRow('Select * from person') {
			persons << it.toRowResult()
		}
		persons
	}

}
