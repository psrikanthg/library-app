package com.library.dto;

import org.springframework.stereotype.Component;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class BookDTO {
	
	
	private Long bookId;
	
	
	private Integer isbnNumber;
	
	@NotNull(message = "Please provide Book Title ID(title)")
	@NotBlank
	private String title;
    
	@NotNull(message = "Please provide Book Author(author)")
	@NotBlank
	private String author;
	

}
