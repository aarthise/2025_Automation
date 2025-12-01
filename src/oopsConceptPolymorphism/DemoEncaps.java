package oopsConceptPolymorphism;

public class DemoEncaps {

	
	private int age=40;  //global variable
	
	private String name = "john";
	
	public static void main(String[] args) {
		DemoEncaps de = new DemoEncaps();
		System.out.println(de.getAge());
		System.out.println(de.getName());
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age; //this a keyword to differentiate between local and global variable
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
