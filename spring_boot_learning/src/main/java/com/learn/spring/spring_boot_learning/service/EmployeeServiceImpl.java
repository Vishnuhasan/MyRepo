package com.learn.spring.spring_boot_learning.service;

import com.learn.spring.spring_boot_learning.entity.Employee;
import com.learn.spring.spring_boot_learning.dto.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    HashMap<Integer, Employee> employeeMap = new HashMap<>();

    @Override
    public EmployeeResponseDTO createEmployee(EmployeeRequestDTO empRequest) {
        Employee e = new Employee(empRequest.getId(),empRequest.getName(),empRequest.getSalary(),empRequest.getDepartmentName());
        employeeMap.put(e.getId(),e);
        return new EmployeeResponseDTO(e.getId(),e.getName(),e.getSalary(),e.getDepartmentName());
    }

    @Override
    public List<EmployeeResponseDTO> getAllEmployees() {
        List<EmployeeResponseDTO> list = new ArrayList<>();
        for (Employee e:employeeMap.values()){
            list.add(getEmployeeBasedOnId(e.getId()));
        }
        return list;
    }

    @Override
    public EmployeeResponseDTO getEmployeeBasedOnId(int id) {
        Employee e = employeeMap.get(id);
        return new EmployeeResponseDTO(e.getId(),e.getName(),e.getSalary(),e.getDepartmentName());
    }

    @Override
    public EmployeeResponseDTO updateEmployee(int id, EmployeeRequestDTO empRequest) {
        Employee e = employeeMap.get(id);
        if(Objects.nonNull(empRequest.getName()))
             e.setName(empRequest.getName());
        if(Objects.nonNull(empRequest.getDepartmentName()))
             e.setDepartmentName(e.getDepartmentName());
        return new EmployeeResponseDTO(e.getId(),e.getName(),e.getSalary(),e.getDepartmentName());
    }

    @Override
    public DeleteEmployeeResponse deleteEmployee(DeleteEmployeeRequest request) {
        if (employeeMap.containsKey(request.getId())){
            Employee e = employeeMap.remove(request.getId());
            return new DeleteEmployeeResponse(e.getId()+" - is deleted successfully");
        }
        return new DeleteEmployeeResponse("Employee not found with id "+request.getId());
    }

}
