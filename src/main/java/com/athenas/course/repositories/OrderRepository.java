package com.athenas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.athenas.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
