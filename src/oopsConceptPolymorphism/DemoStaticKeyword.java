package oopsConceptPolymorphism;

public class DemoStaticKeyword {
	
	static int x=100;

	
	public static void printValueX() {
		//int x=100;
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		/*DemoStaticKeyword ds = new DemoStaticKeyword(); 
		ds.printValueX();*/
		
		DemoStaticKeyword.printValueX();
	}

}
