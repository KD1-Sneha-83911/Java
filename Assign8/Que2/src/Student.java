
class Student implements Comparable<Student>{
	private int roll;
	private String name;
	private String city;
	private double marks;

	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int roll,String name,String city,double marks) {
		// TODO Auto-generated method stub
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return (this.roll-o.roll);
	}

	public String getCity() {
		return city;
	}
	
	public double getMarks() {
		return marks;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee [rollno=" + roll + "name=" + name +  "city "+city +" marks=" + marks  +"]";
	}

	
	
}
