import java.util.Scanner;
public class Que3 {

	public static void main(String[] args) {
		String s1="";
		int l;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String"+s1);
		s1=sc.next();
		
		l =s1.length();
		//s1.trim();
		//s1.split(); 
		System.out.println("Length of String is :"+l);
		
		sc.close();
}
}
