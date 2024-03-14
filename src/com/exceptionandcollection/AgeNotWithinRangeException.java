package com.exceptionandcollection;

//WILL Create AgeNotWithinRange Exception

public class AgeNotWithinRangeException extends Exception {
	//create constructor
	public AgeNotWithinRangeException(String message) {
		super(message);
	}

}
