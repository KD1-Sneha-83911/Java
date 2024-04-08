package com.app.fruits;
import java.util.Scanner;

public class Orange extends Fruits{

private String taste;
	
	public String Taste()
	{
		return "Sweet and Sour";
	}
	
	public String getTaste()
	{
		return taste;
	}
	
	public void setTaste(String taste)
	{
		taste = this.taste;
	}
	
	public void accept(Scanner sc)
	{
		super.accept(sc);
		System.out.println("Enter taste");
		taste = sc.next();
	}
	
	public void display()
	{
		super.display();
		System.out.println("Taste : "+taste);
	}
}
