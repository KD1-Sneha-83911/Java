package com.sunbeam.day8;
import com.sunbeam.interfaces.*;
import java.util.Scanner;

public abstract class Employee implements A{
	private String firstName;
	private String lastName;
	private int ssn;      		// Social security num

	public Employee() {
		
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getSsn() {
		return ssn;
	}
	@Override
	public void accept(Scanner sc) {
		System.out.print("Enter first name -  ");
		firstName = sc.next();
		System.out.print("Enter last name -  ");
		lastName = sc.next();
	}
	
	public void display()
	{
		System.out.print("First name : "+firstName);
		System.out.println("Last Name :"+lastName);
	}
	
	public abstract int calculateSal();
	
	
}
