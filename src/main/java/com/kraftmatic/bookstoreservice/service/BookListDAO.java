package com.kraftmatic.bookstoreservice.service;

import com.kraftmatic.bookstoreservice.models.Book;
import com.kraftmatic.bookstoreservice.models.BookList;

public interface BookListDAO {

	public BookList getBooksByAuthor(String author);

	public BookList getBooks();

	public void submitBook(Book book);

}
