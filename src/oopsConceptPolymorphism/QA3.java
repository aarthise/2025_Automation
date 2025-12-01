package oopsConceptPolymorphism;

import mytraining.DemoInterface_QA1;

public class QA3 implements DemoInterface_QA1{

	public void multi(int a, int b) {
		int c=a*b;
		System.out.println("Multiplication of a and b is: " +c);
	}
	
	public static void main (String[] args) {
		QA3 q3= new QA3();
		q3.multi(3,5);
		
		q3.meth5();
		//q3.sum(3,8);
		//q3.subs(9,8);
		//System.out.println(q3.name);
	}

	@Override
	public void meth5() {
		System.out.println("this is method from DemoInterface_QA1 ");
		
	}
}
