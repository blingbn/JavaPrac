package com.test;

class Book{
	String title;
	String author;
	int price;
	
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public Book() {
		super();
	}

	public String getInfo() {
		return title + "\t" + author + "\t" + price;
	}

}

public class Ex05_13 {

		public static void changeBook(Book book) {//함수의 매개변수로 클래스를 받음, 클래스타입과 변수명
			book.title = "Java8";
			book.price = 3000;
		}
		public static void main(String[] args) {
			Book book = new Book("Java", "인경열", 2000);
			System.out.println("main의 변경전 info : " + book.getInfo());
			changeBook(book);
			System.out.println("main의 변경후 info : " + book.getInfo());
		}

	}


