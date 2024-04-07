package com.max.bff.controller;


import com.max.bff.dto.BrandDto;
import com.max.bff.entity.Brand;
import com.max.bff.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/brand")
public class BrandController {

    @Autowired
    BrandService brandService;
    private BrandDto dto;

    @PostMapping("/createbrand")
    @ResponseStatus(value = HttpStatus.CREATED, reason="Brand Created Successfully")
    public Brand addBrand(@RequestBody Brand brand){
        return brandService.saveBrand(brand);
    }

    @GetMapping()
    public List<Brand> getBrand()
    {
        return brandService.getBrand();
    }
}
