package com.programmerorange.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programmerorange.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
}
