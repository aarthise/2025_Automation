package oopsConceptInheritance;

public class QA1 {
	
	
	String name ="Java";
	
	public void sum(int a, int b) {
		int c=a+b;
		System.out.println("sum of a and b is: " +c);
		System.out.println("sum method in QA1");

	}
	
	public static void main(String[] args) {
		QA1 q1 = new QA1();
		q1.sum(1,4);
		System.out.println(q1.name);

	}

}
