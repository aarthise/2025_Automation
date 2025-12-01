package myassignment;

public class Employee1 {


	public void calculateSalary() {
		int basic = 10000;
		int allowance = 20000;
		
		int salary = basic+allowance;
		System.out.println("Salary with basic and allowance: "+salary);
	}
	
	public void calculateSalary(int basic,int allowance,int bonus ) {
		int salary = basic+allowance+bonus;
		System.out.println("Salary with basic, allowance and bonus: "+salary);
	}
	
	
	public static void main(String[]args) {
		Employee1 E1 = new Employee1();
		E1.calculateSalary();
		E1.calculateSalary(10000,25000,5000);
	}
}
