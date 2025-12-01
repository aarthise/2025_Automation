package oopsConceptPolymorphism;

public class CallDemoInterface implements DemoInterface{

	@Override
	public void meth3() {
		System.out.println("This is my method3");

	}

	@Override
	public void meth4() {
		System.out.println("This is my method4");
		
	}
	public static void main(String[] args) {
		CallDemoInterface cdi = new CallDemoInterface();
		cdi.meth3();
		cdi.meth4();
	}

}
