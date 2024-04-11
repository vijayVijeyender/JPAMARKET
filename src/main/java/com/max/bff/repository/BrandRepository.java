package com.max.bff.repository;

import com.max.bff.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Brand,Long> {
     Brand findByBrandName(String name);
}
