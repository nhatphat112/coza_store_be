package com.coza_store.product_service.product_service.service;

import com.coza_store.product_service.product_service.entity.CategoryEntity;
import com.coza_store.product_service.product_service.entity.ProductEntity;
import com.coza_store.product_service.product_service.exception.CustomException;
import com.coza_store.product_service.product_service.payload.request.CreateProductRequest;
import com.coza_store.product_service.product_service.repository.ProductRepository;
import com.coza_store.product_service.product_service.service.imp.ProductServiceImp;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService implements ProductServiceImp {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public void create(CreateProductRequest request) {
        try {
            CategoryEntity categoryEntity = CategoryEntity.builder()
                    .id(request.getCategoryId())
                    .build();
            ProductEntity productEntity = ProductEntity.builder()
                    .productName(request.getProductName())
                    .price(request.getPrice())
                    .description(request.getDescription())
                    .categoryEntity(categoryEntity)
                    .build();
            productRepository.save(productEntity);

        }catch (Exception e){
            log.info("Error create product.");
            throw new CustomException(e.getMessage());
        }
    }
}
