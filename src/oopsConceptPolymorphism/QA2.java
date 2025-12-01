package oopsConceptPolymorphism;

import mytraining.DemoInterface_QA1;

public class QA2 implements DemoInterface_QA1{
	
	int x=100;
	public void printvaluex() {
		int x=200;
		System.out.println(x);//local
		System.out.println(this.x);//will print to global

		
	}
	
	public QA2() {
		System.out.println("this is QA2");
	}
		
	public void sum(int a, int b) {
		int c=a*a+b*b;
		System.out.println("sum of a*a& b*b is: " +c);
	}
	
	public void subs(int a, int b) {
		int c=a-b;
		System.out.println("subs of a and b is: " +c);
	}
	
	public static void main(String[] args) {
		QA2 q2 = new QA2();
		q2.subs(20,30);
		
		//QA1 q1 = new QA1();
		q2.sum(2,4);
		//System.out.println(q2.name);
		DemoEncaps de = new DemoEncaps();
		System.out.println(de.getAge());
		System.out.println(de.getName());
		q2.meth5();
	}

	@Override
	public void meth5() {
		System.out.println("Overridden method from DemoInterface_QA1");
		
	}

}
