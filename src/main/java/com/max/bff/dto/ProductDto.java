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
    @JsonProperty("bName")
    private String bName; //brandname
    @JsonProperty("cName")
    private String cName; //categoryname
    private String productName;
    private String productNameTn;
    private String productDescription;
    private String productDescriptionTn;
}
