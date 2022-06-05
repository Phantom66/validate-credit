package com.core.validatecredit.model;



import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PostLoad;
import javax.persistence.PrePersist;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;
import lombok.Data;




@Data
@Entity
public class StatusCredit {

    @SequenceGenerator(name = "SQ_STATUS_CREDIT")
    @Id
    @GeneratedValue(
        strategy= GenerationType.SEQUENCE,
        generator = "SQ_STATUS_CREDIT")
    private Long id;

    @Column(name = "CREATED_AT")
    private Date createdAt;

    @OneToOne(cascade = CascadeType.ALL)
    private Credit credit;

    @OneToOne(cascade = CascadeType.ALL)
    private TypeStatusCredit typeStatusCredit;


    @Transient
    private StatusCreditType statusTypeCredit;

    
}