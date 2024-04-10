package com.sunbeam.testers;
import com.sunbeam.entity.*;
import com.sunbeam.exceptions.ExceptionLineTooLong;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String d;
		d = sc.nextLine();
		InputString q = new InputString();
		
		
		try {
			q.setDemo(d);
		}
		catch(ExceptionLineTooLong e)
		{
			e.printStackTrace();
		}
		System.out.println("String length is  " +d.length()+" and appropriate..");
		

	}

}
