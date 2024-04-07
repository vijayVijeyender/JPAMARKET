package com.max.bff.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@JsonInclude
public class ProductDto {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("itemName")
    private String productName;
}
