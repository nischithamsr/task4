package com.exceptionandcollection;
import java.util.Stack;
public class Stack1 {

	public static void main(String[] args) {
		// create an object of stack
		// use add() to add elements
		Stack<Integer> sk1=new Stack<Integer>();
		
		sk1.add(1);
		sk1.add(2);
		sk1.add(3);
		sk1.add(4);
		sk1.add(5);
		System.out.println("the existed data:" +sk1);
		// method to push elements 
		sk1.push(6);
	System.out.println("after pushing:" +sk1);
	// method to pop elements
	    int top = sk1.pop();
	System.out.println("after poping:" +top);
	
	     

	}

}

// output

//the existed data:[1, 2, 3, 4, 5]
//after pushing:[1, 2, 3, 4, 5, 6]
//after poping:6








