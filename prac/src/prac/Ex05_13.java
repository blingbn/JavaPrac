package prac;

class Book{
	String title;
	String author;
	int price;
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public String getInfo() {
		return title + "\t" + author + "\t" + price;
		}
}


public class Ex05_13 {

	public static void changeBook(Book book) {
		book.title = " Java8 ";
		book.price = 3000;
	}
		
	public static void main(String[] args) {
		Book book = new Book("Java", "인경열", 2000);
		System.out.println("main의 변경 전 info : " + book.getInfo());
		changeBook(book);
		System.out.println("main의 변경 후 info : " + book.getInfo());	
	}
}
