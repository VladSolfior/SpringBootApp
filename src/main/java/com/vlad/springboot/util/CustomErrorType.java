package com.vlad.springboot.util;

/**
 * Created by vlad on 14-Jun-17.
 */
public class CustomErrorType {
    private String errorMesage;

    public CustomErrorType(String errorMesage) {
        this.errorMesage = errorMesage;
    }

    public String getErrorMesage() {
        return errorMesage;
    }
}
