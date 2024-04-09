package com.sunbeam.day8;

import java.util.Scanner;

public class Commisioned extends Employee {

	private int grossSal;
	private int comm;
	
	public Commisioned() {
		grossSal = 1200;
		comm = 5;
	}
	
	public int getComm() {
		return comm;
	}
	
	public int getGrossSal() {
		return grossSal;
	}
	@Override
	public int calculateSal() {
		int g = getGrossSal();
		int c = getComm();
		
		return g*c;
		
	}
	
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter Gross Salary - ");
		grossSal = sc.nextInt();
		
		System.out.println("Enter Commision - ");
		comm = sc.nextInt();
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Gross Salary "+grossSal);
		System.out.println("Commision "+comm);
		int l = calculateSal();
		System.out.println("Commisioned salary is "+l);
	}

	
}
