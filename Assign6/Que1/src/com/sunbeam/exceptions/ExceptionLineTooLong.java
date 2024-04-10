package com.sunbeam.exceptions;
import com.sunbeam.entity.*;
import com.sunbeam.testers.*;

public class ExceptionLineTooLong extends Exception {
	
	private String message;
	private String field;
	
	public ExceptionLineTooLong() {
		message = "String length is more than 80!!!!";
		field = "";
	}

	public ExceptionLineTooLong(String message, String field) {
		this.message = message;
		this.field = field;
	}
	
	public ExceptionLineTooLong(String message) {
		this.message = message;
	}
	
	@Override
	public void printStackTrace() {
		System.err.println("Exception :");
		System.err.println("InvalidTimeException : " + message);
		System.err.println("Field :" + field);
	}
	
	
	
	

}
