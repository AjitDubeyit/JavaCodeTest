package com.ajit.springdatamanydbs.repository;

import org.springframework.data.repository.CrudRepository;

import com.ajit.springdatamanydbs.entity.product.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{

}
