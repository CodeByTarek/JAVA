import java.util.*;
import java.io.*;
import java.lang.*;

class Book{
	private int ISBN;
	private String bookTitle;
	private int numberOfPages;
	private static int count = 0;
	
	Book(){
		count++;
	}
	
	Book(int ISBN, String bookTitle, int numberOfPages){
		this.ISBN = ISBN;
		this.bookTitle = bookTitle;
		this.numberOfPages = numberOfPages;
		count++;
	}
	
	public String toString(){
		return this.ISBN + " " + this.bookTitle + " " + this.numberOfPages;
	}
	
	public static int getCount(){
		return count;
	}
	
}

class BookDemo{
	public static void main(String[] args){
		/*
		Book[] books = new Book[3];
		Scanner input = new Scanner(System.in);
		int isbn, page;
		String title;
		for(int i=0; i<books.length; i++){
			isbn = input.nextInt();
			input.nextLine();
			title = input.nextLine();
			page = input.nextInt();
			books[i] = new Book(isbn, title, page);
			System.out.println("Books Count: " + Book.getCount());
		}
		
		for(int i=0; i<books.length; i++){
			System.out.println(books[i].toString());
		}
		*/
		
		Book b = new Book(104, "The old man and the sea", 258);
		
		System.out.println("Final Books Count: " + Book.getCount());
		
		System.out.println(System.currentTimeMillis());
		
		
		
	}
}
	
	