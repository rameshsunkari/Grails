package com.test.intro

class RegularExprTest {

	static main(args) {

		// returns false
		println "potatoe" ==~ /potatoessss/

		// returns true
		println "potatoe" ==~ /potatoe/

		// pattern matcher
		println "potato" ==~ /potatoe?/

		// o is option in this case, false
		println 'potatis' ==~ /potato?s/

		// true
		println 'potats' ==~ /potato?s/


		def theRegularExpression = /Wisniewski/
		checkSpelling("Wisniewski", theRegularExpression)
		checkSpelling("Wisnewski", theRegularExpression)

		theRegularExpression = /Wisniew?ski/
		checkSpelling("Wisniewski", theRegularExpression)
		checkSpelling("Wisnieski", theRegularExpression)
		checkSpelling("Wisniewewski", theRegularExpression)

		theRegularExpression = /Wisn(ie|ei)w?ski/
		checkSpelling("Wisniewski", theRegularExpression)
		checkSpelling("Wisneiski", theRegularExpression)
		checkSpelling("Wisniewewski", theRegularExpression)

		theRegularExpression = /Wis[abcd]niewski/ // requires one of 'a', 'b', 'c' or 'd'
		// false
		checkSpelling("Wisniewski", theRegularExpression)
		theRegularExpression = /Wis[abcd]?niewski/ // will allow one of 'a', 'b', 'c' or 'd', but not required (like above)
		// true
		checkSpelling("Wisniewski", theRegularExpression)
		theRegularExpression = /Wis[a-zA-Z]niewski/ // requires one of any upper\- or lower-case letter
		// false
		checkSpelling("Wisniewski", theRegularExpression)
		theRegularExpression = /Wis[^abcd]niewski/ // requires one of any character that is '''not''' 'a', 'b', 'c' or 'd'
		// false
		checkSpelling("Wisniewski", theRegularExpression)
	}

	def static checkSpelling(spellingAttempt, spellingRegularExpression) {
		if (spellingAttempt ==~ spellingRegularExpression) {
			println("Congratulations, you spelled it correctly.")
		} else {
			println("Sorry, try again.")
		}
	}
}
