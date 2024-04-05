import java.util.Scanner;

public class CreditLimit {

	int accNo;
	int pendingBalance;
	int chargedItems;
	int creditsApplied;
	int creditLimit;
	int check; // to check for credit limit
	Scanner sc = new Scanner(System.in);
			
			public CreditLimit()
			{
		
			}
	
	public void accept()
	{
		System.out.println("Enter Account Number - ");
		accNo = sc.nextInt();
		System.out.println("Enter pending Balance - ");
		pendingBalance = sc.nextInt();
		System.out.println("Enter charged Items - ");
		chargedItems = sc.nextInt();
		System.out.println("Enter credits Applied - ");
		creditsApplied = sc.nextInt();
		System.out.println("Enter credits Limit - ");
		creditLimit = sc.nextInt();
		
		
	}
	
	public void display()
	{
		System.out.println("Acc no - "+accNo);
		System.out.println("Pending Balance - "+pendingBalance);
		System.out.println("charged Items - "+chargedItems);
		System.out.println("Credits Applied - "+creditsApplied);
		System.out.println("credit Limit - "+creditLimit);
		
	}
	
	public void calculate()
	{
		check = pendingBalance + (chargedItems - creditsApplied);
		if(check>creditLimit)
			System.out.println("Credit limit exceeded!");
		else
			System.out.println("Credit limit not exceeded yet");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreditLimit c = new CreditLimit();
		c.accept();
		c.display();
		c.calculate();
	}

}
