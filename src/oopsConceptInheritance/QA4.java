package oopsConceptInheritance;

public class QA4 extends QA1{

	public void div(int a, int b) {
		int c=a*b;
		System.out.println("Division of a and b is: " +c);
	}
	
	public static void main (String[] args) {
		QA4 q4= new QA4();
		q4.div(5,4);
		//q4.multi(3,5);
		q4.sum(3,8);
		//q4.subs(9,8);
		System.out.println(q4.name);
	}
	
}
