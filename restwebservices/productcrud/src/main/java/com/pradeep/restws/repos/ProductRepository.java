package com.pradeep.restws.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pradeep.restws.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
