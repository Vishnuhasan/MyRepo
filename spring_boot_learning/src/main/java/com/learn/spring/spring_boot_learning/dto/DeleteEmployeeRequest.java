package com.learn.spring.spring_boot_learning.dto;

public class DeleteEmployeeRequest {
    private int id;

    public DeleteEmployeeRequest() {
    }

    public DeleteEmployeeRequest(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
