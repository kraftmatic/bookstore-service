package com.kraftmatic.bookstoreservice.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.kraftmatic.bookstoreservice.models.Book;
import com.kraftmatic.bookstoreservice.models.BookList;

public class BookListDAOImpl implements BookListDAO {

	private Connection connection;
	private Statement statement;

	public BookListDAOImpl() {
	}

	public BookList getBooksByAuthor(String author) {

		String query = "SELECT * FROM employee WHERE author=" + author;
		ResultSet rs = null;
		BookList books = new BookList();

		try {
			// Connect to SQL database
			// retrieve and convert result set into BookList data

			// For testing we'll put in a fake book list
			Book book1 = new Book("Christmas Carol", "Charles Dickens");
			Book book2 = new Book("Tale of Two Cities", "Charles Dickens");
			books.getBooks().add(book1);
			books.getBooks().add(book2);
		} finally {
			// close all connections/statements/etc.
		}

		return books;
	}

	public BookList getBooks() {
		String query = "SELECT * FROM books";
		ResultSet rs = null;
		BookList books = new BookList();

		try {
			// Connect to SQL database
			// retrieve and convert result set into BookList data

			// For testing we'll put in a fake book list
			Book book1 = new Book("Christmas Carol", "Charles Dickens");
			Book book2 = new Book("Hop on Pop", "Dr. Seuss");
			books.getBooks().add(book1);
			books.getBooks().add(book2);

		} finally {
			// close all connections/statements/etc.
		}

		return books;
	}

	public void submitBook(Book book) {

		String query = "SELECT * FROM books";
		ResultSet rs = null;
		BookList books = null;

		try {
			// Connect to SQL database
			// retrieve and convert result set into BookList data
		} finally {
			// close all connections/statements/etc.
		}

	}

}
