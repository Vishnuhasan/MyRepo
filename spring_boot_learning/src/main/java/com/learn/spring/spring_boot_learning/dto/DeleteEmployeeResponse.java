package com.learn.spring.spring_boot_learning.dto;

public class DeleteEmployeeResponse {
    private String message;

    public DeleteEmployeeResponse() {
    }

    public DeleteEmployeeResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
