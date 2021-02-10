package com.exception;

public class RecordNotFoundException extends Exception {
	public RecordNotFoundException(String mesg) {
		super(mesg); //사용자정의 예외클래스
	}

}
