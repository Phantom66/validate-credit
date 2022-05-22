package com.core.validatecredit.presenter;

import com.core.validatecredit.model.ResponseModel;
import com.core.validatecredit.service.RequestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class RequestPresenter {

    @Autowired
    private RequestServiceImpl requestServiceImpl;

    //Para probar el servicio
    private final String DOCUMENT_USUARIO = "123456789";

    public ResponseModel<Boolean> idCredit() {
        ResponseModel<Boolean> responseModel = null;
        final boolean IS_NO_REQUEST = requestServiceImpl.findRequest(DOCUMENT_USUARIO).isEmpty();
        log.info("PRESENTER- {}", IS_NO_REQUEST);
        if (IS_NO_REQUEST) {
            responseModel = new ResponseModel<Boolean>("00", "El cliente No tiene solicitud", IS_NO_REQUEST);
        } else {
            log.info("INGRESANDO IS_REQUEST");
            final boolean STATUS_CREDIT = requestServiceImpl.isCredit(DOCUMENT_USUARIO).get().equalsIgnoreCase("Pagado");
            log.info(requestServiceImpl.isCredit(DOCUMENT_USUARIO).get());
            if (STATUS_CREDIT)
                responseModel = new ResponseModel<Boolean>("00", "Estatus crédito pagado", STATUS_CREDIT);
            else
                responseModel = new ResponseModel<Boolean>("99", "Tiene créidto activo", STATUS_CREDIT);
        }
        return responseModel;
    }

}
