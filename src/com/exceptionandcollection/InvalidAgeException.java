package com.exceptionandcollection;

public class InvalidAgeException extends Exception{
// create constructor to set error message
	public InvalidAgeException(String message) {
	super (message);
}
}