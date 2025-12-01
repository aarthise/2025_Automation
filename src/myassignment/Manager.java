package myassignment;

public class Manager extends Employee1 {
	
	public void calculateSalary(int basic,int allowance,int bonus,int incentive ) {
		int salary = basic+allowance+bonus+incentive;
		System.out.println("Salary with basic,allowance,bonus and incentive: "+salary);
	}
	
	
	public static void main(String[]args) {
		Manager M = new Manager();
		M.calculateSalary();
		M.calculateSalary(10000,30000,5000,8000);
	
	}

}
