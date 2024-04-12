package com.max.bff.service;

import com.max.bff.entity.Brand;
import com.max.bff.exception.TechnicalException;
import com.max.bff.mapper.BrandMapper;
import com.max.bff.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandService {
    @Autowired
    BrandRepository brandRepository;
    @Autowired
     BrandMapper brandMapper;

    public Brand saveBrand(Brand brand) {
try {
    return brandRepository.save(brand);
}catch (Exception e) {
    throw new TechnicalException("Brand Already Exist", HttpStatus.CONFLICT);
}
    }

    public List<Brand> getBrand() {
        return brandRepository.findAll();
    }
}
