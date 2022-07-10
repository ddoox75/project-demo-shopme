package com.project.shopme.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.shopme.domain.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
