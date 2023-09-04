package com.coza_store.product_service.product_service.exception;

import lombok.Builder;

@Builder
public class CustomException extends RuntimeException{
    private int statusCode = 500;
    private String message;

    public CustomException() {

    }

    public CustomException(int statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }
    public CustomException(String message) {
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
