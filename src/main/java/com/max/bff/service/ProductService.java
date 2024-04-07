package com.max.bff.service;

import com.max.bff.dto.ProductDto;
import com.max.bff.entity.Product;
import com.max.bff.mapper.ProductMapper;
import com.max.bff.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private  ProductRepository productRepository;
    private  ProductMapper productMapper;

    public List<Product> getMethod(){
       return productRepository.findAll() ;
    }

}
