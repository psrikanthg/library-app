package com.library.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.library.dto.BookDTO;
import com.library.dto.BorrowerDTO;
import com.library.model.Book;
import com.library.model.Borrower;
import com.library.service.BookService;
import com.library.service.BorrowerService;

import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class LibraryController {

	
	@Autowired
	private BorrowerService borrowerService;
	
	@Autowired
	private BookService bookService;
	
	      @GetMapping(value = "/health")
	    public ResponseEntity<String> healthCheck() {
	        log.info("Requested URL {} ", "/health");
	        return new ResponseEntity<>("OK", HttpStatus.OK);
	    }
	      
	      @PostMapping("/registerBook")
	  	public ResponseEntity<String> registerBook(@Valid @RequestBody BookDTO bookRequest) {
	  		Book book = new Book();
	  		BeanUtils.copyProperties(bookRequest, book);
	  		 log.info("URL {} Request Json {} ", "/saveBook", book);
	  		bookService.saveBook(book);
	  		return new ResponseEntity<String>("Book Created Successfully", HttpStatus.OK);
	  	}
	  	
	  	@PostMapping("/registerBorrower")
	  	public ResponseEntity<Object> registerBorrower(@Valid @RequestBody BorrowerDTO borrowerRequest) {
	  		Borrower borrower = new Borrower();
	  		BeanUtils.copyProperties(borrowerRequest, borrower);
	  		borrowerService.saveBorrower(borrower);
	  		 log.info("URL {} Request Json {} ", "/saveBorrower", borrower);
	  		return new ResponseEntity<Object>("Borrower Created Successfully", HttpStatus.OK);
	  	}
	  	
	  	@PostMapping("/{bookId}/borrow/{borrowerID}")
	    public ResponseEntity<Book> borrowBook(@PathVariable Long bookId, @PathVariable Long userId) {
	        Book borrowedBook = bookService.borrowBook(bookId, userId);
	        if (borrowedBook != null) {
	            return ResponseEntity.ok(borrowedBook);
	        } else {
	            return ResponseEntity.badRequest().build(); // or a more descriptive error response
	        }
	    }
	  	
	  	
	  	@GetMapping("/AllBooks")
	  	public ResponseEntity<Object> getAllBooks() {
	  		 log.info("URL {} Request Json {} ", "/AllBooks");
	  		return new ResponseEntity<Object>(bookService.getAllBooks(), HttpStatus.OK);
	  	}
	 
}
