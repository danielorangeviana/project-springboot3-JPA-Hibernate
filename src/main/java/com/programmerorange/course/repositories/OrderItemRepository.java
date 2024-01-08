package com.programmerorange.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programmerorange.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
}
