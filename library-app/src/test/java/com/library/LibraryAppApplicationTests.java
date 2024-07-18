package com.library;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoSettings;
import org.springframework.boot.test.context.SpringBootTest;

import com.library.model.Book;
import com.library.model.Borrower;
import com.library.service.BookService;
import com.library.service.BorrowerService;

@SpringBootTest
class LibraryAppApplicationTests {

	  @Mock
	  private BookService bookService;
	  
	  @MockitoSettings
	  private BorrowerService borrowerService;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void createBook() {
		
		Book b = new Book();
		b.setAuthor("Srikanth");
		b.setIsbnNumber(12345);
		b.setTitle("Java");
		Book book = bookService.saveBook(b);
		assertNotNull(book);
		
	}
	
	@Test
	public void createBorrower() {
		
		Borrower b = new Borrower();
		b.setEmailId("psrikanthg.0303@gmail.com");
		b.setName("srikanth");
		Borrower brrow = borrowerService.saveBorrower(b);
		assertNotNull(brrow);
		
	}

}
