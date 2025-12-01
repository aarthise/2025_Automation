package myassignment;

public class MathOperations {
	
	public int squareofanumber(int a) {
		
		int s = a*a;
		return s;			
	}
	
	public int cubeofanumber(int a) {
		
		int s = a*a*a;
		return s;
				
	}
	public boolean isEven(int a) {
	
		if(a%2==0) {
			return true;
		}else {
			return false;
		}
					
	}
	
	public static void main(String[] args) {
		MathOperations  MO = new MathOperations();
		int squarevalue = MO.squareofanumber(5);
		System.out.println(squarevalue);
		int cubevalue = MO.cubeofanumber(5);
		System.out.println(cubevalue);
		//boolean isEven = MO.isEven(5);
		boolean x = MO.isEven(18);
		System.out.println(x);
		
		}
}
