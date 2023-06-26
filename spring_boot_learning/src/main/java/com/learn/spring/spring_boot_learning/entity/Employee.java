package com.learn.spring.spring_boot_learning.entity;

import lombok.*;


@Data
@AllArgsConstructor
public class Employee {
    private int id;
    private String name;
    private int salary;
    private String departmentName;
}

