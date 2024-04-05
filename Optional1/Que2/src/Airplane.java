import java.util.Scanner;

public class Airplane {
	
	
	
	public void boardingPass()
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean [] arr = new boolean[10];
		for(boolean ele:arr)
		{
			ele = false;
		}
		int choice=5;
		int Findex = 0;
		int Lindex = 5;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Please enter 1 to book in First class");
			System.out.println("Please enter 2 to book in Economy class");
			System.out.println("Enter 0 to exit");
			System.out.println("Enter choice");
			choice = sc.nextInt();
			/*System.out.println("");
			System.out.println();
			System.out.println();
			System.out.println();*/
			
			switch(choice)
			{
			case 1:
				while(Findex<5)
				{
					arr[Findex] = true;
					System.out.println("Booking in First Class done");
					Findex++;
					break;
					
					
				}
				
				if(arr[4]==true)
				{
					int n;
					System.out.println("Will you be okay to travel from Economy class?");
					System.out.println("Enter 4 for yes and 5 for no");
					n = sc.nextInt();
							switch(n)
							{
							case 4:
								arr[Lindex]= true;
								System.out.println("Booking in Economy Class done");
								break;
								
							case 5:
								System.out.println("The next flight is in 3 hours");
								break;
								
							}
				}
				
				break;
				
			case 2:
				while(Lindex<10)
				{
					arr[Lindex] = true;
					System.out.println("Booking in First Class done");
					Lindex++;
					break;
				}
				
				if(arr[9]==true)
				{
					int n1;
					System.out.println("Will you be okay to travel from First class?");
					System.out.println("Enter 4 for yes and 5 for no");
					n1 = sc.nextInt();
							switch(n1)
							{
							case 4:
								arr[Findex] = true;
								System.out.println("Booking in First Class done");
								break;
								
							case 5:
								System.out.println("The next flight is in 3 hours");
								break;
								
							}
				}
				break;
				
			
				
			}
		}while(choice!=0);
	}

}
