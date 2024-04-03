package com.app.geometry;

import java.util.Scanner;
import java.lang.Math;

public class Point2D {
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	Scanner sc = new Scanner(System.in);
	
	Point2D()
	{
		 x1 = 0;
		y1 = 0;
		 x2 = 0;
		 y2=0;
	}
	/*Point2D(int x1, int y1,int x2,int y2)
	{
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}*/
	
	void accept()
	{
		System.out.println("Enter coordinates for first point");
		System.out.println("Enter X Coordinate");
		x1 = sc.nextInt();
		System.out.println("Enter Y Coordinate");
		y1 = sc.nextInt();
		
		System.out.println("Enter coordinates for second point");
		System.out.println("Enter X Coordinate");
		x2 = sc.nextInt();
		System.out.println("Enter Y Coordinate");
		y2 = sc.nextInt();
		
	} 
	
	public void coordinates()
	{
		System.out.println("Point (" + x1 + "," + y1 + ")");
		System.out.println("Point (" + x2 + "," + y2 + ")");
	}
	
	public void isEqual()
	{
		if((x1==x2 && y1==y2))
			System.out.println("equal");
		System.out.println("false");
	}
	
	public void distance()
	{
		double d;
		double xdiff = Math.abs(x2-x1);
		double ydiff = Math.abs(y2-y1);
		
		double xs = Math.pow(xdiff,2);
		double ys = Math.pow(ydiff,2);
		
		double ds = xdiff + ydiff;
		
		d = Math.sqrt(ds);
		
		System.out.println("distance "+d);
	}
	
	public void getDetails1()
	{
		String details;
		details = "["+ x1 + "," + y1+"]";
		System.out.println(details);
	}
	
	public void getDetails2()
	{
		String details;
		details = "["+ x2 + "," + y2+"]";
		System.out.println(details);
	}
	
	
}
