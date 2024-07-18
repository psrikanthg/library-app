package com.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.library.model.Book;
import com.library.model.Borrower;
import com.library.repository.BookRepository;
import com.library.repository.BorrowerRepository;

import jakarta.transaction.Transactional;
import lombok.extern.log4j.Log4j2;

@Service
@Transactional
@Log4j2

public class BookServiceImpl implements BookService {

	
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private BorrowerRepository borrowerRepository;
	
	
	public Book findById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }
	
	
	@Override
	public Book saveBook(Book book) {
		log.info("Saving Book Service");
		return bookRepository.save(book);
	}

	@Override
	public List<Book> getAllBooks() {
		log.info("Getting All Book Service");
		return (List<Book>) bookRepository.findAll();
	}

	@Override
	public Book updateBook(Book book) {
	  return null;
	
	}
	
	 public Book borrowBook(Long bookId, Long userId) {
	        Book book = findById(bookId);
	        Borrower user = borrowerRepository.findById(userId).orElse(new Borrower());

	        if (book != null && user != null) {
	            book.setBorrowedBy(user);
	            return saveBook(book);
	        }
	        
	        return null;
	    }
	 

	@Override
	public void deleteBook(Long bookId) {
		Book book  = new Book();
		book.setBookId(bookId);
		bookRepository.delete(book);
		
	}

	
	
}
