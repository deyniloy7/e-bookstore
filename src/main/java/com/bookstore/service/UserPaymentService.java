package com.bookstore.service;

import com.bookstore.domain.UserPayment;

public interface UserPaymentService {

	UserPayment findById(Long creditCardId);

	void removeById(Long creditCardId);

	
}
