package com.core.validatecredit.model;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;



@Data
@Entity
public class Credit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Request request;
    private int statusCreditId;//Revisar ER
    @OneToOne(cascade = CascadeType.ALL)
    private TypeCredit typeCredit;
    private int amountApproved;
    private int feeQuantity;
    private int rateDay;
    private Date payDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;


    
}