package mytraining;

public class Firstclass {
	
	int a=10;//global variable
	float b=10.5f;
	char c='a';
	String d="Java";
	boolean e= false;
	
	String f="Selenium";
	
	public String name="Selenium";
	
	public void printvalues()
	{
		final int a = 20; //local variable
		d="Core Java";
		
		StringBuffer sb = new StringBuffer("Automation");	
		sb.insert(0,"Selenium");
		System.out.println(sb.reverse());
		//sb.append("Testing");
		//System.out.println(sb);

	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
	
	}
	
	public void meth2() {
		System.out.println(f);
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		Firstclass fc = new Firstclass();
		fc.meth2();
		fc.printvalues();
	    System.out.println(fc.f);
	    fc.meth2();
	}

}
