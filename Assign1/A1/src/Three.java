import java.util.Scanner;

public class Three {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice;
		int total=0;
		
		
		
		do {
			
		//stem.out.println("Enter quantity");
			System.out.println("Enter choice");
			choice = sc.nextInt();
			switch(choice)
			{
			case 0:
				System.out.println("for generating bill");
				break;
			case 1:
				System.out.println("Enter quantity");
				int b;
				b= sc.nextInt();
				
				total += b * 30;
				System.out.println("total"+total);
				
			break;
			
			case 2:
				System.out.println("Enter quantity");
				int d;
				d = sc.nextInt();
				
				total += d * 15;
				
			break;
			
			case 3:
				System.out.println("Enter quantity");
				int p;
				p= sc.nextInt();
				
				total += p* 10;
				
			break;
			
			case 4:
				System.out.println("Enter quantity");
				int r;
				r= sc.nextInt();
				
				total += r* 15;
				
			break;
			
			case 5:
				System.out.println("Enter quantity");
				int v;
				v= sc.nextInt();
				
				total += v* 15;
				
			break;
			
			case 6:
				System.out.println("Enter quantity");
				int s;
				s= sc.nextInt();
				
				total += s* 15;
				break;
			
			case 7:
				System.out.println("Enter quantity");
				int m;
				m= sc.nextInt();
				
				total += m* 15;
				
			break;
			
			case 8:
				System.out.println("Enter quantity");
				int bp;
				bp= sc.nextInt();
				
				total += bp *15;
				
			break;
			
			case 9:
				System.out.println("Enter quantity");
				int n;
				n= sc.nextInt();
				
				total += n* 15;
				
			break;
			
			case 10:
				System.out.println("Enter quantity");
				int i;
				i= sc.nextInt();
				
				total += i* 15;
				
			break;
			
			default:
				System.out.println("Wrong choice....");
				break;
			}
		}while(choice!=0);
		
		System.out.println("The total is : " + total);
	}

}
