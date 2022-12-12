package com.athenas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.athenas.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
