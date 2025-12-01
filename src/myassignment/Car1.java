package myassignment;

public class Car1 extends Vehicle {
	
	public void speed(int a) {
		System.out.println("Speed of a car: "+a);
		
	}
	public static void main (String[]args) {
		Car1 c1 = new Car1();
		c1.speed();
		c1.speed(50);
		}
}
