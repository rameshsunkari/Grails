package com.test.beans

class Person {
	
	Integer id
	String firstName
	String lastName
	String personcol




	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName="
				+ lastName + ", personcol=" + personcol + "]";
	}	



	public Person(Integer id, String firstName, String lastName,
			String personcol) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.personcol = personcol;
	}
	
	

}
