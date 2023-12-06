package com.programmerorange.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programmerorange.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
}
