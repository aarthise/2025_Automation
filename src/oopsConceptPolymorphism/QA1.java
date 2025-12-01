package oopsConceptPolymorphism;

public class QA1 {
	
	
	String name ="Java";
	int x=500;
	
	public QA1() {
		System.out.println("this is QA1");
	}
	
	public void sum(int a, int b) {
		int c=a+b;
		System.out.println("sum of a and b is: " +c);
	}

	public void sum(int a, float b) {
		float c=a+b;
		System.out.println("sum of a and b is: " +c);

	}

	public void sqsum(int a) {
		int b=a*a;
		System.out.println(b);
	}
	
	public void sqsum(String a) {
		System.out.println(a);
	}
	
	public void sum(int a, int b,int c) {
		int d=a+b+c;
		System.out.println("sum of a and b is: " +d);

	}

	public static void main(String[] args) {
		QA1 q1 = new QA1();
		q1.sum(1,4);
		q1.sum(1,2.5f);
		q1.sum(1,2,3);
		q1.sqsum(3);
		q1.sqsum(null);
		
		System.out.println(q1.name);

	}

}
