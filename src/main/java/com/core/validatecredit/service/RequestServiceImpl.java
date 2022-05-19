package com.core.validatecredit.service;

import java.util.Optional;
import com.core.validatecredit.model.Request;
import com.core.validatecredit.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;



@Slf4j
@Service
public class RequestServiceImpl implements RequestService {

    @Autowired
    private RequestRepository requestRepository;

    @Override
    public Optional<Request> findRequest(String document) {
        log.info("Document {} findRequest", document);
        return requestRepository.findRequest(Integer.parseInt(document));
    }

    @Override
    public Optional<String> isCredit(String document) {
        log.info("Document {} isCredit", document);
        return requestRepository.isCredit(Integer.parseInt(document));
    }
    
}
