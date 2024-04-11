package com.max.bff.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long bid; //brandid
    private Long cid; //categoryid
    private String productName;
    private String productNameTn;
    private String productDescription;
    private String productDescriptionTn;
//    @Column(name = "product unit")
//    private String productUnit;// mesurement type kg, ltr,gram
//    @Column(name = "product selling price")
//    private double productSellingPrice;
//    @Column(name = "product cost price")
//    private double productCostPrice;
}
