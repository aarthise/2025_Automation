package oopsConceptPolymorphism;

public class CallDemoAbsClass extends DemoAbsClass{

	@Override
	public void meth2() {
		System.out.println("This is my Password");
	}
	
	public static void main(String[] args) {
		CallDemoAbsClass cdc = new CallDemoAbsClass();
		cdc.meth1();
		cdc.meth2();
	}

}
