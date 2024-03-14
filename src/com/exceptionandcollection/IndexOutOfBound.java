package com.exceptionandcollection;



public class IndexOutOfBound {

	public static void main(String[] args) {
		//store weekday in arraylist
String[] weekdays= {"sunday, monday,tuesday,wednesday,thursday,friday,saturday"};
 try {
	 String x=weekdays[7];
	 // array index out of boundException
		System.out.println(x);}
	catch
	(ArrayIndexOutOfBoundsException Exception) {
		System.out.println(Exception);
 
		
	}	

	}	
	}
// output
//java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 1