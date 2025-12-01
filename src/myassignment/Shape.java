package myassignment;

public class Shape {
	
	public void Areaofacircle(int radius) {
		double ACircle = 3.14*(radius*radius);
		System.out.println("Area of a circle: "+ACircle);
	}
	
	public void Areaofarectangle(int length,int breadth) {
		int ARectangle = length*breadth;
		System.out.println("Area of a circle: "+ARectangle);
		
	}

	public void Areaofatriangle(int base,int height) {
		int ATriangle = base*height;
		System.out.println("Area of a circle: "+ATriangle);
		
	}
	
	public static void main (String[] args) {
		Shape S1 = new Shape();
		
		S1.Areaofacircle(2);
		S1.Areaofarectangle(3,2);
		S1.Areaofatriangle(2,2);
	}
}
