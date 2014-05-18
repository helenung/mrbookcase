package com.example.booksafe;

import java.util.*;

public class BookShelf {
	private List<Book> books;
	
	public BookShelf() {
		books = new ArrayList<Book>();
	}
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public Book getBook(int index) {
		return books.get(index);
	}
}
