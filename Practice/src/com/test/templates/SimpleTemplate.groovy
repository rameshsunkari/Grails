package com.test.templates

import groovy.text.SimpleTemplateEngine

class SimpleTemplate {

	static main(args) {
	
		def text = 'Dear "$firstname $lastname",\nSo nice to meet you in <% print city %>.\nSee you in ${month},\n${signed}'
		
		def binding = ["firstname":"Ramesh", "lastname":"Sunkari", "city":"Vijayawada", "month":"January", "signed":"Groovy-Dev"]
		
		def engine = new SimpleTemplateEngine()
		def template = engine.createTemplate(text).make(binding)
		
		println template
	}

}
