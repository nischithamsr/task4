package com.exceptionandcollection;

public class Student {
	// Fields
	int rollnum;
	String name;
	int age;
	String course;
	
// Constructor creation
	public Student(int rollnum,String name,int age,String course) {
		this.rollnum=rollnum;
		this.name=name;
		this.age=age;
		this.course=course;
	}

// method to show AgeNotWithinRange Exception
	
	public void age() throws AgeNotWithinRangeException{
		if(age>=15 && age<=21){
			System.out.println("age within the range");
		}else {
			throw new AgeNotWithinRangeException("age is not accepted");
		}
	}
	
	
			
	
	
	

}
