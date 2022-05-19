package com.core.validatecredit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;


@Data
@Entity
public class TypeStatusCredit {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String descStatus; 
    
}