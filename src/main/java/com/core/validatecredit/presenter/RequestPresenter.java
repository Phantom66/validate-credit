package com.core.validatecredit.presenter;

import com.core.validatecredit.model.ResponseModel;
import com.core.validatecredit.service.RequestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RequestPresenter {

    @Autowired
    private RequestServiceImpl requestServiceImpl;

    public ResponseModel<Boolean> idCredit() {
        ResponseModel<Boolean> responseModel = null;
        final boolean IS_CREDIT = requestServiceImpl.isCredit("20044824").isEmpty();
        if (IS_CREDIT)
            responseModel = new ResponseModel<Boolean>("00", "No tiene créditos", IS_CREDIT);
        else
            responseModel = new ResponseModel<Boolean>("99", "Si tiene créditos ", IS_CREDIT);
        return responseModel;
    }

}
