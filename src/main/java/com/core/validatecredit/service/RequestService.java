package com.core.validatecredit.service;


import java.util.Optional;
import com.core.validatecredit.model.Request;



public interface RequestService {

    public Optional<Request> findRequest(String document);

    public Optional<String>  isCredit(String document);

}
