package com.coza_store.product_service.product_service.helper;

import com.coza_store.product_service.product_service.exception.CustomException;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.List;
@Slf4j
@Service
@NoArgsConstructor
public class ThrowExceptionFieldErrors {
    public void throwException(BindingResult result){
        List<FieldError> errors = result.getFieldErrors();
        for (FieldError item:errors){
            log.info("Response :"+item.getField());
            throw new CustomException(item.getField().toString());
        }
    }
}
