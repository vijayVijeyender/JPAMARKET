package com.max.bff.repository;

import com.max.bff.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
     Category findByCategoryName(String name);
}
