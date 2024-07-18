package com.library.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity 
@Table(name="Book")
public class Book  implements Serializable{
	

	private static final long serialVersionUID = -590814255441140825L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long bookId;
	
	private Integer isbnNumber;
	
	private String title;
	
	private String author;
	
	@ManyToOne
    @JoinColumn(name = "borrowerId")
    private Borrower borrowedBy;
	

	public Borrower getBorrowedBy() {
		return borrowedBy;
	}

	public void setBorrowedBy(Borrower borrowedBy) {
		this.borrowedBy = borrowedBy;
	}

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	

	public Integer getIsbnNumber() {
		return isbnNumber;
	}

	public void setIsbnNumber(Integer isbnNumber) {
		this.isbnNumber = isbnNumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	

}
