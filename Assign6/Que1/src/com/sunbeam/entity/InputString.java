package com.sunbeam.entity;
import com.sunbeam.testers.*;
import com.sunbeam.exceptions.*;

public class InputString {

	private String demo;
	
	public void setDemo(String demo) throws ExceptionLineTooLong {
		
		if(demo.length()>5)
			throw new ExceptionLineTooLong();
		this.demo = demo;
	}
	
}
