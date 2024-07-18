package com.library.repository;

import org.springframework.data.repository.CrudRepository;

import com.library.model.Borrower;

public interface BorrowerRepository extends CrudRepository<Borrower, Long> {

	
}
