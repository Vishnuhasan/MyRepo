package com.gfg.jdbl53.l7_spring_boot_crud_example.model;

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
