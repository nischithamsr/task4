package com.exceptionandcollection;

public class Voter {

		// fieldS
		int id;
		String name;
		int age;
	
//constructor creation 
	public Voter(int id,String name, int age) {
	this.id=id;
	this.name=name;
	this.age=age;
	}
		// method to show invalid age exception
	public void print() throws InvalidAgeException {
		if(age>=18) { 
			System.out.print("eligible to vote");
		}else {
				throw new InvalidAgeException("not eligible for voting");
		}
	}
}












   
