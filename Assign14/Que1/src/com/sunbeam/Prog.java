package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/*String isbn, double price, String authorName, int quantity, Catego
 * 
 * 
 */

public class Prog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<BookStore> s1 = new HashSet<>();
		
		
		//s1.add( new BookStore("2537-2378-237",300.00,"Abdul Kalam" ,2,Category.BIOGRAPHY));
		//s1.add( new BookStore("934-2378-23737",1000.00,"Sane Guruji" ,2,Category.BIOGRAPHY));
		//s1.add( new A14("9037-2298-2037",200.00,"Abdul Kalam" ,2,Category.BIOGRAPHY));		
		s1.toString();
		
		int choice;
		Scanner sc = new Scanner(System.in);
		
		class CategorySort implements Comparator<BookStore>
		{

			@Override
			public int compare(BookStore o1, BookStore o2) {
				// TODO Auto-generated method stub
				int val = o1.category.compareTo(o2.category);
				return val;
			}
			
		}
		
		class AuthorSort  implements Comparator<BookStore>
		{

			@Override
			public int compare(BookStore o1, BookStore o2) {
				// TODO Auto-generated method stub
				int val = (o1.getAuthorName().compareTo(o2.getAuthorName()));
				return val;
			}
			
		}
		
		
		do {
			System.out.println("Enter 0 to exit");
			System.out.println("1. Accept book details and add in collection");
			System.out.println("2. Display all books from collection");
			System.out.println("3. Sort the book details as per category and display it.");
			System.out.println("4. Sort the book details as per author and display it.");
			System.out.println("5. Find book by id.");
			System.out.println("chpice???");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 0:
				System.out.println("bye---");
				break;
				
			case 1:
			{
				System.out.println("Enter isbn");
				String i = sc.next();
				System.out.println("Enter price");
				double p = sc.nextDouble();
				System.out.println("Enter Author name");
				String n = sc.next();
				System.out.println("Enter quantity");
				int q = sc.nextInt();
				System.out.println("Enter the category :");
				int category =sc.nextInt();
				s1.add(new BookStore(i,p,n,q,category));
				
			}
				break;
				
			case 2:
			{
				for (BookStore bookStore : s1) {
					System.out.println(bookStore);
				}
			}
				break;
				
			case 3:
			{
				Comparator<BookStore> b2 = new CategorySort();
				List<BookStore> b = new ArrayList<>(s1);
				Collections.sort(b,b2);
				
				for (BookStore book : b) {
					System.out.println(book);
				}
			}
				break;
				
				
				
			case 4:
			{
				Comparator<BookStore> b1= new AuthorSort();
				List<BookStore>  b = new ArrayList<>(s1);
				Collections.sort(b,b1);
				for (BookStore book : b) {
					System.out.println(book);
				}
				
			}
				break;
		
			case 5:
			{
				System.out.println("enter id");
				int id = sc.nextInt();
				for(int i=0;i<s1.size();i++)
				{
					
				}
				
			}
				break;
			}
		}while(choice!=0);
		
		
	}

}
/*1. Accept book details and add in collection
2. Display all books from collection
3. Sort the book details as per category and display it.
4. Sort the book details as per author and display it.
5. Find book by id.*/