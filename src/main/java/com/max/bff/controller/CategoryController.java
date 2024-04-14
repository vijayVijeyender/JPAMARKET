package com.max.bff.controller;

import com.max.bff.entity.Category;
import com.max.bff.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/category")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping()
    public ResponseEntity<List<Category>> getCategory(){
      return ok(categoryService.getCategory());
    }

    @PostMapping("/createcategory")
    public ResponseEntity<String> saveCategory(@RequestBody Category category){
        categoryService.saveCategory(category);
        return ok("saved Successfully");
    }
}
