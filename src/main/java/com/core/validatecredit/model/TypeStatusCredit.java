package com.core.validatecredit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import lombok.Data;


@Data
@Entity
public class TypeStatusCredit {


    @SequenceGenerator(name = "SQ_TYPE_STATUS_CREDIT")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_TYPE_STATUS_CREDIT")
    private Long id;
    private String descStatus; 
    
}