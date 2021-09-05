package com.telusko;

public class TeluskoException extends Exception {

	public TeluskoException(String s) {
		
		super(s); //the msg goes into s then that msg goes into Exception from there it goes into detailMessage
	}

}
