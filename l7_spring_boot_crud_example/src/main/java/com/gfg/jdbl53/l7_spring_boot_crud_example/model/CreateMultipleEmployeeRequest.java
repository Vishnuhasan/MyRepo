package com.gfg.jdbl53.l7_spring_boot_crud_example.model;

import com.gfg.jdbl53.l7_spring_boot_crud_example.entity.Employee;

import java.util.List;

public class CreateMultipleEmployeeRequest {
    private List<Employee> list;

    public CreateMultipleEmployeeRequest() {
    }

    public CreateMultipleEmployeeRequest(List<Employee> list) {
        this.list = list;
    }

    public List<Employee> getList() {
        return list;
    }

    public void setList(List<Employee> list) {
        this.list = list;
    }
}
