package com.coza_store.product_service.product_service.exception;

import com.coza_store.product_service.product_service.payload.response.BaseResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {
    @ExceptionHandler(CustomException.class)
    public ResponseEntity<?> customException(CustomException e){
        BaseResponse response = BaseResponse.builder()
                .statusCode(e.getStatusCode())
                .message(e.getMessage())
                .data("")
                .build();
        return new ResponseEntity<>(response,HttpStatus.OK);
    }
}
