package com.app.fruits;
import java.util.Scanner;

import com.app.tester.*;

public class Fruits {

	private String color;
	private double weight;
	private String name;
	private boolean isFresh;
	
	
	Fruits()
	{
		this(" ",0.0," ",false);
	}
	Fruits(String color,double weight,String name,boolean isFresh)
	{
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
		
	}
	
	
	public String toString(String color,double weight,String name,boolean isFresh)
	{
		String res = "{ color : "+this.color+" , "+" weight : "+this.weight+" , "+ " name : "+this.name +" , "
	   +" Fresh :"+ this.isFresh+ ")";
		
		return res;
		
	}
	
	public String taste(String taste)
	{
		return "no specific taste";
	}
	
	public void accept(Scanner sc)
	{
		System.out.println("Enter color");
		color= sc.next();
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter weight");
		weight= sc.nextDouble();
		System.out.println("Enter true if fresh and false if not");
		isFresh= sc.nextBoolean();
	}
	
	public void display()
	{
		System.out.println("Color : "+color);
		System.out.println("Name :"+name);
		System.out.println("Weight :"+weight);
		System.out.println("Fresh :"+isFresh);
	}
	
	public String getName()
	{
		return name;
	}
	
	public boolean getIsFresh()
	{
		return isFresh;
	}
}

