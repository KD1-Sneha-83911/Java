package com.app.tester;
import java.util.Scanner;

import com.app.fruits.*;
public class FruitBasket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s ;
		int choice;
		int index=0;
		System.out.println("Enter size of array: ");
		s = sc.nextInt();
		Fruits arr[] = new Fruits[s];
		
		do {
			System.out.println("Enter 0 to  Exit");
			System.out.println(" Enter 1 to  Add Mango");
			System.out.println(" Enter 2 to  Add Orange");
			System.out.println("Enter 3 to  Add Apple");
			System.out.println("4. Display names of all fruits in the basket.");
			System.out.println("5. Display name,color,weight , taste of all fresh fruits , in the basket.");
			System.out.println("6. Display tastes of all stale(not fresh) fruits in the basket.");
			System.out.println("7. Mark a fruit as stale");
			System.out.println("8. Mark all sour fruits stale ");
			System.out.println("Enter choice");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 0:
				System.out.println("Thnk u");
				break;
				
			case 1:
				if(index<s)
				{
					Mango m = new Mango();
					m.accept(sc);
					arr[index] = m;
					index++;
				}
				break;
				
			case 2:
				if(index<s)
				{
					Orange o= new Orange();
					o.accept(sc); 
					arr[index] = o;
					index++;
				}
				break;
				
			case 3:
				if(index<s)
				{
					Apple a = new Apple();
					a.accept(sc);
					arr[index] = a;
					index++;
				}
				break;
				
			case 4:
				for(int i = 0;i<index;i++)
				{
					System.out.println(arr[i].getName());
					/*
					if(arr[i] instanceof Orange)
					{
						System.out.println("Names of oranges are");
						/*Fruits f1 = (Fruits)arr[i];
						String nn = f1.getName();
					    String nn = arr[i].getName();
						System.out.println(nn);
					}
					
					
					else if(arr[i] instanceof Mango)
					{
						System.out.println("Names of Mangoes are");
						String nn = arr[i].getName();
						System.out.println(nn);	
					}
					else
					{
						System.out.println("Names of Apples are");
						String nn = arr[i].getName();
						System.out.println(nn);
					}*/
				}
				break;
		
			case 5:
				for(int i = 0;i<index;i++)
				{
					
					if(arr[i] instanceof Orange)
					{
						System.out.println("Names of oranges are");
						Orange o = (Orange)arr[i];
						o.display();
					}
					
					
					else if(arr[i] instanceof Mango)
					{
						System.out.println("Names of Mangoes are");
						Mango m = (Mango)arr[i];
						m.display();
						
					}
					else
					{
						System.out.println("Names of Apples are");
						Apple a = (Apple)arr[i];
						a.display();
					}
				}
				break;
				
			case 6:
				for(int i=0;i<index;i++)
				{
					if(!arr[i].getIsFresh())
					{
						if(arr[i] instanceof Orange)
						{
							System.out.println("Taste of oranges ");
							Orange o = (Orange)arr[i];
							System.out.println(o.getTaste());
						}
						
						
						else if(arr[i] instanceof Mango)
						{
							System.out.println("Names of Mangoes are");
							Mango m = (Mango)arr[i];
							System.out.println(m.getTaste());
							
						}
						else
						{
							System.out.println("Names of Apples are");
							Apple a = (Apple)arr[i];
							System.out.println(a.getTaste());						}

					}
				}
				break;
				
			case 7:
				for(Fruits fruit:arr)
				{
					if(!fruit.getIsFresh())
						System.out.println(fruit.getName() +" Stale");
				}
					
				break;
				
			case 8:
				for(int i=0;i<index;i++)
				{
					if(arr[i] instanceof Orange)
			     	{
					
						
					Orange o = (Orange)arr[i];
					String g = o.getTaste();
					if(g=="sour")
						System.out.println(o.getName()+" is Stale");
			    	}
				
				
				else if(arr[i] instanceof Mango)
				{
					
					Mango m = (Mango)arr[i];
					String p = m.getTaste();
					if(p=="sour")
						System.out.println(m.getName()+" is Stale");
					
				}
				else
				{
					
					Apple a = (Apple)arr[i];
					String p = a.getTaste();
					if(p=="sour") 
						System.out.println(a.getName()+" is Stale");				
				}
				}
			
				
				

				break;
				}
			}while(choice!=0);
		
		
	}

}

/*
 if (p instanceof Employee) {
			Employee e = (Employee) p; // Downcasting
			e.salaryAfterTax();
		}
		if (p instanceof Student) {
			Student s = (Student) p; // Downcasting
			s.calulatePercent();
		}*/
