package com.library.dto;



import org.springframework.stereotype.Component;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class BorrowerDTO {
	
	
    private Long borrowerId;
	
    @NotNull(message = "Please provide Borrower Name(name)")
    @NotBlank
	private String name;
    
    @Email
  	@NotNull(message = "Please provide Borrower Email ID(emailId)")
    @NotBlank
    private String emailId;

}
