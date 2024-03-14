package com.exceptionandcollection;

public class DriverMain {

	public static void main(String[] args) {
		// creation of object
		Student st=new Student(101,"nish",27,"science");
		//keep code in try and catch
		try{
			st.age();
		}catch(AgeNotWithinRangeException e  ) {
	System.out.println("error:" +e);
		}
}
}
//output
//error:com.exceptionandcollection.AgeNotWithinRangeException: age is not accepted
