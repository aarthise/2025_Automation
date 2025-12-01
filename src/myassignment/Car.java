package myassignment;

public class Car {
	
	public void classdetails() {
		
		String model="Outback";
		int year=2020;
		String brand="Subaru";
		
		System.out.println("Car Brand :"+brand);
		System.out.println("Car Model :"+model);
		System.out.println("Car Year :"+year);
	}
	public static void main (String[] args) {
		Car c= new Car();
		c.classdetails();
			}

}
