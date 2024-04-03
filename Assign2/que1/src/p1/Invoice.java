package p1;


public class Invoice {

	private String partNumber;
	private String partDescription;
	private int quantity;
	double p; //price per item
	
	Invoice()
	{
		partNumber = "";
		partDescription = "";
		quantity = 0;
		p = 0.0;
	}
	
	public void setPartNumber(String partNumber)
	{
		this.partNumber = partNumber;
	}
	
	public void setPartDescription(String partDescription)
	{
		this.partDescription = partDescription;
	}
	
	public void setQuantity(int quantity)
	{
			this.quantity = quantity;
	}
	
	public void setPrice(double p)
	{
			this.p = p;		
	}
	
	public String getPartNumber()
	{
		return partNumber;
	}
	
	public String getPartDescription()
	{
		return partDescription;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
	public double getPrice()
	{
		return p;
	}
	
	public void amount()
	{
		double a = getPrice();
		int b = getQuantity();
		
		if(a<0.0) {a = 0.0;}
		
		if(b<0) {b = 0;}
		System.out.println((double)(a*b));
	}
	
}



