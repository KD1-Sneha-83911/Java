

import java.util.Scanner;


public class Que1 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String");
		StringBuffer s1 = new StringBuffer(sc.next());
		StringBuffer s2 = s1.reverse();
		System.out.println("Reverse of String is "+s2);
		
	}

}