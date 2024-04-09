package com.sunbeam.day8;

import java.util.Scanner;

public class WeeklySal extends Employee {
	//variable
	private int weeklySalary;
	
	//parameterLESS const
	public WeeklySal() {
		weeklySalary =  90000;
	}
	
	//getter
	public int getWeeklySalary() {
		return weeklySalary;
	}
	
	//Overriden function
	public int calculateSal() {
		int w = getWeeklySalary();
		return w;
		
	}
	
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter Salary - ");
		weeklySalary = sc.nextInt();
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Weekly Salary "+weeklySalary);
		int a = calculateSal();
		System.out.println("Salaried employee will get Rs. "+a);
		//System.out.println("Commision "+comm);
	}
	

}
