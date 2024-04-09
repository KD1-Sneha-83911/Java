package com.sunbeam.day8;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("ENTER 0 to exit");
			System.out.println("ENTER 1 FOR SALARIFIED EMPLOYEE ");
			System.out.println("ENTER 2 FOR Hourly EMPLOYEE ");
			System.out.println("ENTER 3 FOR Commisioned EMPLOYEE ");
			System.out.println("ENTER 4 FOR Base-Salarified EMPLOYEE ");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
			{
				Employee s = new WeeklySal();
				//WeeklySal o = (WeeklySal)s;
				s.accept(sc);
				s.display();
				s.calculateSal();
			}
				break;
				
			case 2:
			{
				Employee h = new Hourly();
				h.accept(sc);
				h.display();
			}
				break;
				
			case 3:
			{
				Employee s = new Commisioned();
				s.accept(sc);
				s.display();
			}
				break;
				
			case 4:
			{
				Employee s = new BaseSal();
				BaseSal k = (BaseSal)s;
				k.accept(sc);
				k.display();
				
			}
				break;
			}
			

		}while(choice!=0);
	}

}
