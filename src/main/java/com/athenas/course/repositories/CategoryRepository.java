package com.athenas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.athenas.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
