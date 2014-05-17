package com.example.booksafe;

public class Book {
	private String title;
	private String author;
	private int year;
	private String publisher;
	private int rating;
	
	private Book(String title, String author, int year, String publisher, int rating) {
		this.title = title;
		this.author = author;
		this.year = year;
		this.publisher = publisher;
		this.rating = rating;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public int getYear() {
		return year;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public int getRating() {
		return rating;
	}
}
