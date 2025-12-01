package myassignment;

public class Student {
	
	public void displayinfo() {
		
	String name="Mithra";
	int rollnumber=10;
	
	System.out.println("Student Name :"+name);
	System.out.println("Student Rollnumber :"+rollnumber);
	
	}
	public static void main (String[] args) {
		Student s= new Student();
		s.displayinfo();
	}
}
