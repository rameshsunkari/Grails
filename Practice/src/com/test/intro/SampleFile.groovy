package com.test.intro

class SampleFile {
	
	static main(args) {
		def myFileDirectory = "/home/user/Ramesh/Learning/Grails/Sample/"
		def myFileName = "fileReadTest"
		def myFile = new File(myFileDirectory + myFileName)
		
		
		// named closure
		myFile.eachLine( printFileLine )
		
		// anonymous closure
		myFile.eachLine ({println "line:" + it})
		
		println myFile.parent
	}
	
	static printFileLine = { println "File line: " + it }

}
