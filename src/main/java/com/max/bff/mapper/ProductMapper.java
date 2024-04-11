package com.max.bff.mapper;


import com.max.bff.dto.ProductDto;
import com.max.bff.entity.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(
        componentModel = "spring"
)
public interface ProductMapper {

    ProductDto toDto(Product product);
    List<ProductDto> toDtos(List<Product> products);
    Product toEntity(ProductDto productDto);
}
