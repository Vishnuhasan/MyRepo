package com.gfg.jdbl53.l7_spring_boot_crud_example.model;

public class UpdateEmployeeResponse {
    private int id;
    private String name;
    private int salary;
    private String departmentName;

    public UpdateEmployeeResponse() {
    }

    public UpdateEmployeeResponse(int id, String name, int salary, String departmentName) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.departmentName = departmentName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

}
