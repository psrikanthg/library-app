package com.library.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Borrowings")
public class Borrowings implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7412413058415997868L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long borrowingsId;
	
	
	
	

}
