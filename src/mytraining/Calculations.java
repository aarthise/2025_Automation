package mytraining;

public class Calculations {
	
	public Calculations() {
		int a = 20;
		int b = 30;
		int c = a+b;
		System.out.println("sum value: through constructor is:"+ c);
		
	}
	public Calculations(int a, int b) {
		//int a = 20;
		//int b = 30;
		int c = a+b;
		System.out.println("sum value: through parameterized constructor is:"+ c);
		
	}
	
	public int sum(){
		int a = 20;
		int b = 30;
		int c = a+b;
		//System.out.println("sum value is:"+ c);
		return c;
		
	}
	
	public int add(int a,int b) {
		
		int c = a+b;
		//System.out.println("addition using parameters:"+c);
		return c;
	}

	public static void main (String[] args) {
		Calculations con = new Calculations(50,80);
		Calculations con1 = new Calculations();
		int x = con1.sum();
		System.out.println(x);
		int y = con.add(10,90);
		System.out.println(y);
	/*	int d= c.sum();
		System.out.println(d);
		int e= c.add(50,60);
		//int e =c.add(30,40);
		int f =c.add(e,30);
		System.out.println(e);
		System.out.println(f);*/		
	}
}
