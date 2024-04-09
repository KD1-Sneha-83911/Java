package com.sunbeam.day8;

import java.util.Scanner;

public class Hourly extends Employee {

	private int hrs;
	private int wage;
	
	public Hourly() {
		hrs = 41;
		wage =  650;
	}
	
	public int getWage() {
		return wage;
	}
	
	public int getHrs() {
		return hrs;
	}
		
	@Override
	public int calculateSal() {
			
    	int w = getWage();
		int h = getHrs();
			
			if(h<=40)
				  return h*w;
				   
		    else 
			 {
				return (int) ((40*w)+((h-40)*w*1.5));
			 }

		}

	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter Hours - ");
		hrs = sc.nextInt();
		
		System.out.println("Enter Wage - ");
		wage = sc.nextInt();
	}
	

	public void display() {
		super.display();
		System.out.println("Hours "+hrs);
		System.out.println("Wages "+wage);
		int l = calculateSal();
		System.out.println("Hourly employee salary is :"+l);
	}
	
	
	

}
