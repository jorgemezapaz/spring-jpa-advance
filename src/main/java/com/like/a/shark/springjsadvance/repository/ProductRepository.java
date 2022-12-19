package com.like.a.shark.springjsadvance.repository;

import com.like.a.shark.springjsadvance.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository  extends CrudRepository<Product, Long> {
}
