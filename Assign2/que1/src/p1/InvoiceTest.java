package p1;

public class InvoiceTest {

	public static void main(String[] args) {
		//Object where price and quantity are +ve
		System.out.println("Object where price and quantity positive");
		Invoice i1 = new Invoice();
		i1.setPartDescription("Part1");
		i1.setPartNumber("01");
		i1.setPrice(45.5);
		i1.setQuantity(5);
		i1.amount();
		
		
		//object where price is negative and quantity is -ve
		System.out.println("object where price is negative and quantity are -ve");
		Invoice i2 = new Invoice();
		i2.setPartDescription("Part2");
		i2.setPartNumber("02");
		i2.setPrice(-1);
		i1.setQuantity(-5);
		i1.amount();
		
		
		
		
		
		

	}

}
