package com.core.validatecredit.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;



@Data
@Entity
public class Credit {

    @SequenceGenerator(name = "SQ_CREDIT")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_CREDIT")
    private Long id;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Request request;

    @Column(name = "CLIENT_ID")
    private Long clientId;
    
    @OneToOne(cascade = CascadeType.ALL)
    private TypeCredit typeCredit;

    @Column(name = "AMOUNT_APPROVED", precision = 99, scale = 8)
    private BigDecimal amountApproved;

    @Column(name = "FEES_TOTAL")
    private Integer feesTotal;

    @Column(name = "RATE_DAY", precision = 99, scale = 8)
    private BigDecimal rateDay;

    @Column(name = "BALANCE_CAPITAL", precision = 99, scale = 8)
    private BigDecimal balanceCapital;

    @Column(name = "AMOUNT_FEE", precision = 99, scale = 8)
    private BigDecimal amountFee;

    @Column(name = "RATE_INTEREST", precision = 99, scale = 8)
    private BigDecimal rateInterest;

    @Column(name = "PAY_DATE")
    private Date payDate;

    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Column(name = "STATUS_CREDIT_ID")
    private StatusCreditType statusCreditId;


    
}