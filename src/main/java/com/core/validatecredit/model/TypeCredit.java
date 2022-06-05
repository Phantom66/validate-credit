package com.core.validatecredit.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;


@Data
@Entity
public class TypeCredit {

    @SequenceGenerator(name = "SQ_CREDIT")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_CREDIT")
    private Long id;

    @Column(name = "DESCRIPTION")
    private String desc;

    @Column(name = "channel")
    private String channel;

    @Column(name = "INSTALLMENT")
    private Integer installment;

    @Column(name = "RATE_COMMISION")
    private BigDecimal rateComission;

    @Column(name = "RATE_INTEREST")
    private BigDecimal rateInterest;

    @Column(name = "AMOUNT_MAX", precision = 99, scale = 10)
    private BigDecimal amountMax;
}
