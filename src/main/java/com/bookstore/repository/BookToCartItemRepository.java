package com.bookstore.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.domain.BookToCartItem;

@Repository
public interface BookToCartItemRepository extends CrudRepository<BookToCartItem, Long> {

}
