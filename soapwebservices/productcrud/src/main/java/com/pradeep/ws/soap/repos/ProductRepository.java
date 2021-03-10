package com.pradeep.ws.soap.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pradeep.ws.soap.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
