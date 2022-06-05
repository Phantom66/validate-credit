package com.core.validatecredit.repository;


import java.util.Optional;
import com.core.validatecredit.model.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface RequestRepository extends JpaRepository<Request, Long>  {

    /**
     * Consulta si el cliente tiene una solicitud
     * 
     * @param document
     * @return
     */
    // @Query("SELECT r FROM Request r")
    @Query("SELECT r FROM Request r join r.client cl WHERE cl.document = ?1")
    public Optional<Request> findRequest(int document);

    // @Query("SELECT t.descStatus FROM StatusCredit sc join sc.typeStatusCredit t join  sc.credit cr join cr.request r join r.client cl WHERE cl.document =?1")
    // @Query("SELECT sc FROM StatusCredit sc") 
    @Query("SELECT t.descStatus FROM StatusCredit sc join sc.typeStatusCredit t join  sc.credit cr join cr.request r join r.client cl WHERE cl.document =?1")
    public Optional<String> isCredit(int document);
    
}
