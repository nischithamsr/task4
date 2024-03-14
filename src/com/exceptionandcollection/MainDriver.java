package com.exceptionandcollection;

public class MainDriver {

	public static void main(String[] args) {
		//object creation 
		Voter v= new Voter(101,"nish",17);
// keep code in try and catch
		try {
			v.print();
		}catch(InvalidAgeException e) {
	System.out.println(e);
	
	}
	}
	}

// output

//com.exceptionandcollection.InvalidAgeException: not eligible for voting