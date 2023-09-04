package com.coza_store.product_service.product_service.controller;

import com.coza_store.product_service.product_service.helper.ThrowExceptionFieldErrors;
import com.coza_store.product_service.product_service.payload.request.CreateProductRequest;
import com.coza_store.product_service.product_service.payload.response.BaseResponse;
import com.coza_store.product_service.product_service.service.imp.ProductServiceImp;
import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/product")
@Slf4j
@RequiredArgsConstructor
public class ProductController {
    @Autowired
    private ThrowExceptionFieldErrors throwExceptionFieldErrors;
    @Autowired
    private ProductServiceImp productServiceImp;
    private Gson gson = new Gson();
    @GetMapping("/create")
    public ResponseEntity<?> create(@Valid @RequestBody CreateProductRequest request, BindingResult result){

        log.info("Request:"+gson.toJson(request));
        throwExceptionFieldErrors.throwException(result);
        productServiceImp.create(request);
        BaseResponse baseResponse = BaseResponse.builder()
                .message("saved product")
                .statusCode(200)
                .data("").build();
        log.info("Response:"+gson.toJson(baseResponse));
        return new ResponseEntity<>(baseResponse,HttpStatus.OK);
    }

}
