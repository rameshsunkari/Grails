package com.test.intro

class StringTest {
	
	static main(args) {
		def stringDate = "2005-07-04"
		def dateArray = stringDate.split("-")	// split() uses regEx's, so you need to escape chars such as a "." -> "\\."
		println dateArray
		def year = dateArray[0].toInteger()
		year = year + 1
		def newDate = year + "-" + dateArray[1] + "-" + dateArray[2]
		
		println newDate
		
		println "potatoe" ==~ /potatoe/
	}

}
