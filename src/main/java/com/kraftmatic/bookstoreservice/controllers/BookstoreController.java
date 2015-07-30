package com.kraftmatic.bookstoreservice.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kraftmatic.bookstoreservice.models.Book;
import com.kraftmatic.bookstoreservice.models.BookList;
import com.kraftmatic.bookstoreservice.service.BookListDAO;
import com.kraftmatic.bookstoreservice.service.BookListDAOImpl;

@RestController
public class BookstoreController {

	BookListDAO bookListDao = new BookListDAOImpl();

	@RequestMapping(value = "/books", method = RequestMethod.GET)
	public BookList getAllBooks() {

		BookListDAO bookListDao = new BookListDAOImpl();
		BookList books = null;
		books = bookListDao.getBooks();

		return books;
	}

	@RequestMapping(value = "/books/author/{author}", method = RequestMethod.GET)
	public BookList getBooksByAuthor(@PathVariable String author) {

		BookListDAO bookListDao = new BookListDAOImpl();
		BookList books = null;
		books = bookListDao.getBooksByAuthor(author);

		return books;
	}

	@RequestMapping(value = "/submitBook", method = RequestMethod.POST)
	public void setNewBook(@RequestBody Book book) {

		bookListDao.submitBook(book);

	}

}
