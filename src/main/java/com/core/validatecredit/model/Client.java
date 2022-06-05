package com.core.validatecredit.model;

import javax.persistence.Column;
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
    @Column(name = "TYEP_DOCUMENT")
    private String typeDocument;
    @Column(name = "DOCUMENT")
    private int document;
    @Column(name = "NAME")
    private String name;
    @Column(name = "PHONE")
    private String phone;
    @Column(name = "HOME_PHONE")
    private String homePhone;
    @Column(name = "EXIST_PATRIA")
    private boolean existPatria;
    @Column(name = "EXIST_EXCHANGE")
    private boolean existExchange;

}
