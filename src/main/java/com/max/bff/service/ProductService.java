package com.max.bff.service;

import com.max.bff.dto.ProductDto;
import com.max.bff.entity.Brand;
import com.max.bff.entity.Product;
import com.max.bff.exception.TechnicalException;
import com.max.bff.mapper.ProductMapper;
import com.max.bff.repository.BrandRepository;
import com.max.bff.repository.CategoryRepository;
import com.max.bff.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private  ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
     BrandRepository brandRepository;

    @Autowired
     ProductMapper productMapper;

    public List<Product> getMethod(){
       return productRepository.findAll() ;
    }

    public String saveProduct(ProductDto productDto) {
        Brand brand=brandRepository.findByBrandName(productDto.getBName());
        var category=categoryRepository.findByCategoryName(productDto.getCName());
        var product= new Product();
        if(brand == null ){
            throw new TechnicalException("Brand  not found", HttpStatus.NOT_FOUND);
        }else if(category==null ){
            throw new TechnicalException("Category not found", HttpStatus.NOT_FOUND);
        }else
        {
            product=  productMapper.toEntity(productDto);
            product.setCid(category.getId());
            product.setBid(brand.getId());
            productRepository.save(product);
            return "save succesfully";

        }
    }
}
