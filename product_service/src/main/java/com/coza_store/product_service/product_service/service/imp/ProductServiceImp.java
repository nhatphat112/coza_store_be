package com.coza_store.product_service.product_service.service.imp;

import com.coza_store.product_service.product_service.payload.request.CreateProductRequest;
import org.springframework.stereotype.Service;

@Service
public interface ProductServiceImp {
    public void create(CreateProductRequest request);
}
