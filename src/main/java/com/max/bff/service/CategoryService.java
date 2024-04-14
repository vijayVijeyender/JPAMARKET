package com.max.bff.service;

import com.max.bff.entity.Category;
import com.max.bff.exception.TechnicalException;
import com.max.bff.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> getCategory(){
        try {
            return categoryRepository.findAll();
        }catch (Exception e){
            throw new TechnicalException("Category not found", HttpStatus.NOT_FOUND);
        }
    }

    public void saveCategory(Category category){
        try {
            categoryRepository.save(category);
        }catch (Exception e){
            throw new TechnicalException("Category Already Exist", HttpStatus.CONFLICT);
        }
    }

}
