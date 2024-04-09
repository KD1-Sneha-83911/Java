package com.sunbeam.day8;

import java.util.Scanner;

public class BaseSal extends Commisioned {
	private int baseSal;
	
	public BaseSal() {
		baseSal = 15000;
	}
	
	public int getBaseSal() {
		return baseSal;
	}
	
	public int calculateSal()
	{
		int g = getGrossSal();
		int c = getComm();
		int b = getBaseSal();
		
		return ((c*g)+b);
		
	}
	
	public int after()
	{
		int g = getGrossSal();
		int c = getComm();
		int b = getBaseSal();
		
		int w = (int)((b*0.1)+(c*g));
		return w;
	}
	
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter Base Salary - ");
		baseSal = sc.nextInt();
	}
	
	@Override
	public void display() {
		
		super.display();
		System.out.println("Base Salary :"+baseSal);
		int l = calculateSal();
		System.out.println("Base-salaried commission employees' salary :"+l);
		int l1= after();
		System.out.println("Base-salaried commission employees' salary after 10% :"+l1);
	}
	
}
