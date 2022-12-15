package com.athenas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.athenas.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
