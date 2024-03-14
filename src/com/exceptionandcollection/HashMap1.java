package com.exceptionandcollection;
import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		// add student data using hashmap class 
		// creation of object of hashmap
		HashMap<String , Integer>  hm1=new HashMap<String , Integer> ();
		// add student data // key-value 
		hm1.put("manish",3);
		hm1.put("nish", 4);
		hm1.put("aish", 5);
		
      System.out.println(" the existed list:" +hm1);
	
	// method to add a new student
	hm1.put("monish",7);
	System.out.println("list after adding student:" +hm1);
	// method to remove a student
	hm1.remove("nish");
	System.out.println("list after removing student:" +hm1);
	} 
}
// output


//the existed list:{aish=5, nish=4, manish=3}
//list after adding student:{aish=5, monish=7, nish=4, manish=3}
//list after removing student:{aish=5, monish=7, manish=3}

	

	
		
		
	


