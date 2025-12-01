package oopsConceptPolymorphism;

public class QA4 extends QA1 implements QA3I{

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
		q4.meth3();
		q4.meth4();
		
	}

	@Override
	public void meth3() {
		System.out.println("this is method from interface QA3I ");

	}

	@Override
	public void meth4() {
		System.out.println("this is method from interface QA4I ");

	}
	
}
