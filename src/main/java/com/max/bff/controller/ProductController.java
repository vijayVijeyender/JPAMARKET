package com.max.bff.controller;

import com.max.bff.dto.ProductDto;
import com.max.bff.entity.Product;
import com.max.bff.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getmethod(){

        return productService.getMethod();
    }
}