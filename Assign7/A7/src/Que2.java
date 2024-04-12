

import java.util.Scanner;

public class Que2 {

	public static void main(String[] args) {
		String s1;
		
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		
		s1=sc.next();
		String rev="";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		System.out.println("Reverse String is: "+rev);
		if(s1.equals(rev))
		{
			System.out.println("String is Palindrome");
			}
		else
		{
			System.out.println("String is not Palindrome");
		}
		
	
		
		
	}

}