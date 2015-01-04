package com.test.beans

class Customer {
    // properties
    Integer id
    String name
    Date dob
	
	

    @Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", dob=" + dob + "]";
	}


	// sample code
    static void main(args) {
        def customer = new Customer(id:1, name:"Ramesh", dob:new Date())
        println("Hello ${customer.name}")
		println "${customer}"
    }
}