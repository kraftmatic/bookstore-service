package com.kraftmatic.bookstoreservice.models;

import java.util.ArrayList;
import java.util.List;

public class BookList {

	private List<Book> books;

	public List<Book> getBooks() {
		if (books == null)
			books = new ArrayList<Book>();
		return books;
	}

}
