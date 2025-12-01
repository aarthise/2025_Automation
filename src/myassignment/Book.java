package myassignment;

public class Book {
	
	public Book() {
		String title="Angels and Deamons";
		String author="Leonardo" ;
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		}
	public Book(String tt,String auth) {
		/*String title="Angels and Deamons";
		String author="Leonardo" ;*/
		System.out.println("Title: "+tt);
		System.out.println("Author: "+auth);
		}
	public static void main(String[] args) {
		Book book = new Book();
		Book book1 = new Book("mons","Leo");
		
	}

}
