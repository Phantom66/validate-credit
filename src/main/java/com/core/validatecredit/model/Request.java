package com.core.validatecredit.model;


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
public class Request {

    @SequenceGenerator(name = "SQ_REQUEST")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_REQUEST")
    private Long id;
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Client client;
    private Long term;
    private Long codReason;
    private Long amountRequest;
    @OneToOne(cascade = CascadeType.ALL)
    private TypeCredit typeCredit;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    
}