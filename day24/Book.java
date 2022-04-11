package day24;

public class Book {
	public String title;
	public int pages;
	public String author;

	public void read() {
		System.out.println("reading " + title);
	}

	public Book() { // empty constructor

	}

	public Book(String title, int pages, String author) {
		this.title = title;
		this.pages = pages;
		this.author = author;
	}
	
	public Book(String title, int pages) {
		this.title = title;
		this.pages = pages;
	}
}