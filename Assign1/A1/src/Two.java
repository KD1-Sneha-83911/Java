import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double n1;
		double n2;
		double a;
		
		//Returns true if the next token in this scanner's input
		//can be interpreted as a double value using the nextDouble() method.
		
		System.out.println("Enter two numbers : ");
		
		
		if(sc.hasNextDouble())
		{
			n1 = sc.nextDouble();
			n2 = sc.nextDouble();
			a=(n1+n2)/2;
			System.out.println("Average is " +a);
		}
		else
		{
			System.out.println("The entered value is not double");
		}
		
		
	}

}
