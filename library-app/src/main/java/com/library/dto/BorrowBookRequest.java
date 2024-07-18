package com.library.dto;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class BorrowBookRequest {

	
	private Integer isbnNumber;
	private String  bookTitle;
	private Long  borrowerId;
	
	
}
