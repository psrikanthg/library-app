package com.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.model.Borrower;
import com.library.repository.BorrowerRepository;

import jakarta.transaction.Transactional;
import lombok.extern.log4j.Log4j2;

@Service
@Transactional
@Log4j2
public class BorrowerServiceImpl implements BorrowerService {

	@Autowired
	private BorrowerRepository borrowerRepository;
	
	
	@Override
	public Borrower saveBorrower(Borrower borrower) {
		return borrowerRepository.save(borrower);
	}

	
	
}
