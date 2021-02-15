package com.exception;

@SuppressWarnings("serial")
public class RecordNotFoundException extends Exception {
	
	public RecordNotFoundException(String mesg) {
		super(mesg);
	}
}
