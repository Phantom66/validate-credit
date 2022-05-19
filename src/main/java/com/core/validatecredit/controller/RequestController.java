package com.core.validatecredit.controller;

import com.core.validatecredit.model.Request;
import com.core.validatecredit.model.ResponseModel;
import com.core.validatecredit.presenter.RequestPresenter;
import com.core.validatecredit.service.RequestServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RequestMapping("/")
@RestController
public class RequestController<T> {



    @Autowired
    private RequestPresenter requestPresenter;

    @GetMapping(value = "validate-credit")
    public ResponseEntity<ResponseModel<Boolean>> findRequestByClient() throws JsonProcessingException {
        log.info("Obtener solicitud cliente ");
        return new ResponseEntity<>(requestPresenter.idCredit(), HttpStatus.OK);
    }

}
