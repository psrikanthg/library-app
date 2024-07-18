package com.library.service;

import java.util.List;

import com.library.model.Book;

public interface BookService {
	
	//Save Book
	
	Book saveBook(Book book);
	
	//Get All Books
	List<Book> getAllBooks();
	
	//update book
	Book updateBook(Book book);
	
	//delete book by book id
	 void deleteBook(Long bookId);
	 
	 public Book borrowBook(Long bookId, Long userId);
	

}
