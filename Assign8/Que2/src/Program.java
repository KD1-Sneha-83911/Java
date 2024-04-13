import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Program{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		class CityA implements Comparator<Student>
		{
			public int compare(Student o1,Student o2) {
				// TODO Auto-generated method stub
				//int val = o1.getCity() o2.getCity();
				//int val = Double.compare(o1.marks, o2.marks);
				
				int diff=o1.getCity().compareTo(o2.getCity());
				
				return diff;
			}

		}
		
		class Marks implements Comparator<Student>
		{
			public int compare(Student o1,Student o2) {
				int val = Double.compare(o1.getMarks(), o2.getMarks());
				return -val;
			}
		}
		
		class Name implements  Comparator<Student>
		{
			@Override
			public int compare(Student o1, Student o2) {
				int res = o1.getName().compareTo(o2.getName());
				return res;
			}
		}
		Student arr[] = new Student[5];
		int choice;
		arr[0] = new Student(3, "Vrushab", "Nagpur",20.3);
		arr[1] = new Student(1, "rahul","Mumbai", 40.25);
		arr[2] = new Student(2, "prashant","Chennai" ,50.0);
		arr[3] = new Student(5, "pratik", "Mannegaon",30.0);
		arr[4] = new Student(4, "onkar","Delhi" ,35.0);
		
		do {
			System.out.println("Enter 0 to exit");
			System.out.println("1. sorted on their city (asc)");
			System.out.println("2. sorted on their on marks (desc)");
			System.out.println("3. sorted on their on name (asc)");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 0:
				System.out.println("Byee..");
				break;
				
			case 1:
			{
				Comparator<Student> CityA = new CityA();
				Arrays.sort(arr,CityA);
				
				for (Student student : arr) {
					System.out.println(student);
				}
			}
				break;
			
			case 2:
			{
				Comparator<Student> Marks = new Marks();
				Arrays.sort(arr,Marks);
				for (Student student : arr) {
					System.out.println(student);
				}
			}
				break;
				
			case 3:
			{
				Comparator<Student> Name = new Name();
				Arrays.sort(arr,Name);
				for (Student student : arr) {
					System.out.println(student);
				}
			}
				break;
				
			
			
			}
			}while(choice!=0);

		
		
		
	}

}


/*
 Comparator<Employee> empNameComparator = new EmployeeNameComparator();

		Arrays.sort(arr, empNameComparator);

		System.out.println("After Sorting -");
		for (Employee employee : arr)
			System.out.println(employee);
 */
