package oopsConceptPolymorphism;

public abstract class DemoAbsClass {
	
	final int x=300;
	public void meth1() {
		
		//x=400;
		System.out.println("This is Concrete Method");
	}
	
	public abstract void meth2();
	
	public static void main(String[] args) {
		/*DemoAbsClass dc= new DemoAbsClass();
		dc.meth1();*/
	}

	
}
