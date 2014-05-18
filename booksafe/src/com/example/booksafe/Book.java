package com.example.booksafe;

public class Book implements Comparable<Book>  {
	private String title;
	private String author;
	private int year;
	private String publisher;
	private double rating;
	private String description;
	
	public Book(String title, String author, int year, String publisher, double rating, String description) {
		this.title = title;
		this.author = author;
		this.year = year;
		this.publisher = publisher;
		this.rating = rating;
		this.description = description;
	}
	
	public int compareTo(Book other) {
		return title.compareTo(other.title);
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
	
	public double getRating() {
		return rating;
	}
	
	public String getDescription() {
		return description;
	}
}
