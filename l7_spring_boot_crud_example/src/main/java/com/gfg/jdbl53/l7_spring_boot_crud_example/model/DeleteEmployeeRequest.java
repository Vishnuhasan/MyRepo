package com.gfg.jdbl53.l7_spring_boot_crud_example.model;

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
