package com.coza_store.product_service.product_service.payload.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateProductRequest {
    @Positive(message = "Id category must be greater than 0.")
    private int categoryId;
    @NotBlank
    @NotNull(message = "Name product must be not null.")
    private String productName;
    @Positive(message = "Price product must be greater than 0.")

    private double price;
    @NotBlank
    @NotNull(message = "Description product must be not null.")
    private String description;

}
