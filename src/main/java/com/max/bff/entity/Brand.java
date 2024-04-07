package com.max.bff.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "brand")
public class Brand {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(name = "brandName",unique=true)
        private String brandName;
        @Column(name = "brandNameTn",unique=true)
        private String brandNameTn;
        @Column(name="brandDescription")
        private String brandDescription;
        @Column(name="brandDescriptionTn")
        private String brandDescriptionTn;
}
