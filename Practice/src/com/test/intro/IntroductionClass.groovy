package com.test.intro

class IntroductionClass {

	static void main(String[] args){
		println "Hello, World! Welcome to Groovy World"
		
		def helloStr = 'Hello, '
		
		def welcomeMsg = 'Welcome to Groovy World'
		
		println helloStr + welcomeMsg
		
		def x = new java.util.Date()
		println x
		
		def myList = [1776, -1, 33, 99, 0, 928734928763]
		
		println myList
		println myList.size()
		
		def scores = [ "Brett":100, "Pete":"Did not finish", "Andrew":86.87934 ]
		
		println scores.Brett
		println scores['Pete']
		
		def emptyMap = [:]
		def emptyList = []
		println emptyMap.size()
		println emptyList.size()
		
		
		
		def	amPM = Calendar.getInstance().get(Calendar.AM_PM)
		if (amPM == Calendar.AM)
		{
			println("Good morning")
		} else {
			println("Good evening")
		}
	}	

}
