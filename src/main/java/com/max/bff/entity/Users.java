package com.max.bff.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Entity
@Getter
@Setter
@Table(name = "users")
public class Users {
    @Id
    private String loginId ;
    private String igg;
    private String firstName;
    private String lastName;
    private String email ;
    private Date updatedDate;
}
