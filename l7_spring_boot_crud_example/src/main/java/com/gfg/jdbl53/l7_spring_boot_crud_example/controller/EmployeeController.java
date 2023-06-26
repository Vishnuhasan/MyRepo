package com.gfg.jdbl53.l7_spring_boot_crud_example.controller;

import com.gfg.jdbl53.l7_spring_boot_crud_example.entity.Employee;
import com.gfg.jdbl53.l7_spring_boot_crud_example.model.*;
import com.gfg.jdbl53.l7_spring_boot_crud_example.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee-portal")
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl empService;

    @RequestMapping("/")
    public String test(){
        return "Test API works";
    }

    @PostMapping("/employee")
    public CreateEmployeeResponse add(@RequestBody CreateEmployeeRequest request){
        return empService.createEmployee(request);
    }

    @RequestMapping("/all-employees")
    public List<GetEmployeeResponse> getALlEmployees(){
        return empService.getAllEmployees();
    }

    @RequestMapping()
    public GetEmployeeResponse getEmployeeBasedOnId(@RequestParam int id){
        return empService.getEmployeeBasedOnId(id);
    }

    @PutMapping("/employee")
     public UpdateEmployeeResponse updateEmployee(@RequestParam int id,@RequestBody UpdateEmployeeRequest request){
        return empService.updateEmployee(id, request);
    }

    @DeleteMapping("/employee")
    public DeleteEmployeeResponse deleteEmployee(@RequestBody DeleteEmployeeRequest request){
        return empService.deleteEmployee(request);
    }

    @PostMapping("/employees")
    public int insertMultipleEmployees(@RequestBody CreateMultipleEmployeeRequest empRequest){
        return empService.insertMultipleEmployees(empRequest);
    }

}
