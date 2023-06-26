package com.gfg.jdbl53.l7_spring_boot_crud_example.service;

import com.gfg.jdbl53.l7_spring_boot_crud_example.entity.Employee;
import com.gfg.jdbl53.l7_spring_boot_crud_example.model.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    HashMap<Integer,Employee> employeeMap = new HashMap<>();

    @Override
    public CreateEmployeeResponse createEmployee(CreateEmployeeRequest empRequest) {
        Employee e = new Employee(empRequest.getId(),empRequest.getName(),empRequest.getSalary(),empRequest.getDepartmentName());
        employeeMap.put(e.getId(),e);
        return new CreateEmployeeResponse(e.getId(),e.getName(),e.getSalary(),e.getDepartmentName());
    }

    @Override
    public List<GetEmployeeResponse> getAllEmployees() {
        List<GetEmployeeResponse> list = new ArrayList<>();
        for (Employee e:employeeMap.values()){
            list.add(getEmployeeBasedOnId(e.getId()));
        }
        return list;
    }

    @Override
    public GetEmployeeResponse getEmployeeBasedOnId(int id) {
        Employee e = employeeMap.get(id);
        return new GetEmployeeResponse(e.getId(),e.getName(),e.getSalary(),e.getDepartmentName());
    }

    @Override
    public UpdateEmployeeResponse updateEmployee(int id, UpdateEmployeeRequest empRequest) {
        Employee e = employeeMap.get(id);
        if(Objects.nonNull(empRequest.getName()))
             e.setName(empRequest.getName());
        if(Objects.nonNull(empRequest.getDepartmentName()))
             e.setDepartmentName(e.getDepartmentName());
        return new UpdateEmployeeResponse(e.getId(),e.getName(),e.getSalary(),e.getDepartmentName());
    }

    @Override
    public DeleteEmployeeResponse deleteEmployee(DeleteEmployeeRequest request) {
        if (employeeMap.containsKey(request.getId())){
            Employee e = employeeMap.remove(request.getId());
            return new DeleteEmployeeResponse(e.getId()+" - is deleted successfully");
        }
        return new DeleteEmployeeResponse("Employee not found with id "+request.getId());
    }

    @Override
    public int insertMultipleEmployees(CreateMultipleEmployeeRequest empRequest) {
        for (Employee e: empRequest.getList()){
            employeeMap.put(e.getId(),e);
        }
        return empRequest.getList().size();
    }
}
