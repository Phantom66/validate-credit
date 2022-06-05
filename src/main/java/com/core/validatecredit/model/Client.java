package com.core.validatecredit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;




@Data
@Entity
public class Client {

    @SequenceGenerator(name = "SQ_CLIENT")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_CLIENT")
    private Long id;
    private String typeDocument;
    private int document;
    private String name;
    private String phone;
    private String homePhone;
    private boolean existPatria;
    private boolean existExchange;

}
