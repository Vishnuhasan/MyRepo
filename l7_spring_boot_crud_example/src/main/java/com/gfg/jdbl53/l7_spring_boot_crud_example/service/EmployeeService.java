package com.gfg.jdbl53.l7_spring_boot_crud_example.service;

import com.gfg.jdbl53.l7_spring_boot_crud_example.entity.Employee;
import com.gfg.jdbl53.l7_spring_boot_crud_example.model.*;

import java.util.List;

public interface EmployeeService {
     CreateEmployeeResponse createEmployee(CreateEmployeeRequest empRequest);
     List<GetEmployeeResponse> getAllEmployees();
     GetEmployeeResponse getEmployeeBasedOnId(int id);
     UpdateEmployeeResponse updateEmployee(int id, UpdateEmployeeRequest empRequest);
     DeleteEmployeeResponse deleteEmployee(DeleteEmployeeRequest request);
     int insertMultipleEmployees(CreateMultipleEmployeeRequest empRequest);
}
