package com.max.bff.controller;

import com.max.bff.dto.ProductDto;
import com.max.bff.entity.Product;
import com.max.bff.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

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

    @PostMapping("/createProduct")
    public ResponseEntity<String> saveProduct(@RequestBody ProductDto productDto){
        return ok(productService.saveProduct(productDto));
    }

    @PutMapping()
    public ResponseEntity<String> updateProduct(@RequestBody Product product){
        return ok(productService.updateProduct(product));
    }

    @GetMapping("/productcategory/{categoryId}")
    public ResponseEntity<List<Product>> getProductByCategory(@PathVariable Long categoryId ){
        return ok(productService.getProductsByCategory(categoryId));
    }
}