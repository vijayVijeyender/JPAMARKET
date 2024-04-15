package com.max.bff.repository;
import com.max.bff.entity.Category;
import com.max.bff.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    Product findByProductName(String name);

    List<Product> findByCid(Long categoryId);
}
