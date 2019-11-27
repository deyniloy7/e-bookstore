package com.bookstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.domain.UserPayment;
import com.bookstore.repository.UserPaymentRepository;
import com.bookstore.service.UserPaymentService;

@Service
public class UserPaymentServiceImpl implements UserPaymentService {
	
	@Autowired
	UserPaymentRepository userPaymentRepository;

	@Override
	public UserPayment findById(Long creditCardId) {
		return userPaymentRepository.findById(creditCardId).get();
	}

	@Override
	public void removeById(Long creditCardId) {
		userPaymentRepository.deleteById(creditCardId);
	}

}
