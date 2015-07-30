package com.kraftmatic.bookstoreservice.controllers;

import java.sql.SQLException;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kraftmatic.bookstoreservice.models.Book;
import com.kraftmatic.bookstoreservice.models.BookList;
import com.kraftmatic.bookstoreservice.service.BookListDAO;

@RestController
public class BookstoreController {

	@RequestMapping(value = "/books", method = RequestMethod.GET)
	public BookList getAllBooks() {

		BookListDAO bookListDao = new BookListDAO();
		BookList books = null;
		try {
			books = bookListDao.getBooks();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return books;
	}

	@RequestMapping(value = "/books/author/{author}", method = RequestMethod.GET)
	public BookList getBooksByAuthor(@PathVariable String author) {

		BookListDAO bookListDao = new BookListDAO();
		BookList books = null;
		try {
			books = bookListDao.getBooksByAuthor(author);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return books;
	}

	@RequestMapping(value = "/submitBook", method = RequestMethod.POST)
	public void setNewBook(@RequestBody Book book) {
		BookListDAO bookListDao = new BookListDAO();

		try {
			bookListDao.submitBook(book);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
