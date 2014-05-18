package com.example.booksafe;

import java.util.*;
import java.io.*;

public class Methods {
	/* read from file to create book object */
	public void writeBook(File f) throws FileNotFoundException {
		Scanner input = new Scanner(f);
		Book newBook = null;
		if (input.hasNextLine()) {
			String title = input.nextLine();
			String author = input.nextLine();
			int year = (int) input.nextLine();
			String publisher = input.nextLine();
			double rating = (double) input.nextLine();
			newBook = new Book(title, author, year, publisher, rating);
		}
	}
}
