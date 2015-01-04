package com.test.templates

import groovy.text.GStringTemplateEngine

class GStringTemplateTest {

	static main(args) {
		def binding = ["firstname":"Ramesh", "lastname":"Sunkari", "city":"Kanigiri", "month":"January", "signed":"Groovy-Dev"]
		def f = new File('/home/user/Ramesh/Learning/Grails/Sample/test.template')
		def engine = new GStringTemplateEngine()
		def template = engine.createTemplate(f).make(binding)
		println template.toString()
	}

}
