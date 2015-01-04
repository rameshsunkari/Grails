package com.test.sql

import groovy.sql.Sql

class TestSQL {

	static main(args) {
		def sql = Sql.newInstance("jdbc:mysql://localhost:3306/groovytest", "testuser",
			"testuser", "com.mysql.jdbc.Driver")
		
		def food = sql.dataSet('Person')
		def cheeses = food.findAll { it.last_name == 'test%' }
		cheeses.each { println "Person ${it}" }
	
	}

}
