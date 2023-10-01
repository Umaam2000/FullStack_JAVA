package com.ust.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.spring.entiry.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
