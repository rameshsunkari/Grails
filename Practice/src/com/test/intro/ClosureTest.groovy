package com.test.intro

class ClosureTest {

	static main(args) {

		println square(9)

		def result = [1, 2, 3, 4].collect(square)

		println result

		[ "Yue" : "Wu", "Mark" : "Williams", "sudha" : "Kumari" ].each(printMapClosure)


		def fullString = ""
		def orderParts = ["BUY", 200, "Hot Dogs", "1"]
		orderParts.each {
			if (fullString == "") {
				fullString += "First Item = "
			} else {
				fullString += "Next Item = "
			}
			fullString += it + ", "
		}

		println fullString

		def myMap = ["China": 1 , "India" : 2, "USA" : 3]

		result = 0
		myMap.keySet().each( { result+= myMap[it] } )
		println result
		myMap.keySet().each {
			println it
		}
	}

	static square = {it*it}

	static printMapClosure = { key, value -> println key + "=" + value }
}
