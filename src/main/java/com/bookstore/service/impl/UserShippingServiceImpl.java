package com.bookstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.domain.UserShipping;
import com.bookstore.repository.UserShippingRepository;
import com.bookstore.service.UserShippingService;

@Service
public class UserShippingServiceImpl implements UserShippingService {

	@Autowired
	UserShippingRepository userShippingRepository;
	
	@Override
	public UserShipping findById(Long shippingAddressId) {
		return userShippingRepository.findById(shippingAddressId).get();
	}

	@Override
	public void removeById(Long userShippingId) {
		userShippingRepository.deleteById(userShippingId);
		
	}

}
