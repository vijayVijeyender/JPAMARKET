package com.max.bff.controller;


import com.max.bff.entity.Brand;
import com.max.bff.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/brand")
public class BrandController {

    @Autowired
    BrandService brandService;

    @PostMapping("/createbrand")
    public ResponseEntity<Brand> addBrand(@RequestBody Brand brand){
        return ok(brandService.saveBrand(brand));
    }

    @GetMapping()
    public List<Brand> getBrand()
    {
        return brandService.getBrand();
    }
}
