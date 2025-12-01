package oopsConceptInheritance;

public class QA2 extends QA1{
	
	public void subs(int a, int b) {
		int c=a-b;
		System.out.println("subs of a and b is: " +c);
	}
	
	public static void main(String[] args) {
		QA2 q2 = new QA2();
		q2.subs(20,30);
		
		//QA1 q1 = new QA1();
		q2.sum(1,4);
		System.out.println(q2.name);
	}

}
