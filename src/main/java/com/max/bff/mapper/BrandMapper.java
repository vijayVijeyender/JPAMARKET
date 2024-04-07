package com.max.bff.mapper;

import com.max.bff.dto.BrandDto;
import com.max.bff.entity.Brand;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper(
        componentModel = "spring"
)
public interface BrandMapper {
    BrandDto toDto(Brand brand);
    Brand toEntity(BrandDto brandDto);
    List<BrandDto> toDtos(List<Brand> brand);
}
