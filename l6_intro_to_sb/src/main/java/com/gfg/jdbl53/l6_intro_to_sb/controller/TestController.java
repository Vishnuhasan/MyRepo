package com.gfg.jdbl53.l6_intro_to_sb.controller;

import com.gfg.jdbl53.l6_intro_to_sb.entity.Employee;
import com.gfg.jdbl53.l6_intro_to_sb.model.EmployeeRequestModel;
import com.gfg.jdbl53.l6_intro_to_sb.model.EmployeeResponseModel;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest")
public class TestController {

    @RequestMapping("/")
    public String test(){
        return "Test Api Works";
    }

    @RequestMapping("/greet/{name}")
    public String greet(@PathVariable String name){
        return "Hello"+name;
    }

    @RequestMapping("/greetRP")
    public String greetRP(@RequestParam String name){
        return "Hello"+name;
    }

    @PostMapping("/new-employee")
    public EmployeeResponseModel addEmployee(@RequestBody EmployeeRequestModel empModel){
        Employee e= new Employee(empModel.getId(), empModel.getName(), empModel.getSalary(), empModel.getDepartmentName());

        EmployeeResponseModel employeeResponseModel = new EmployeeResponseModel(e.getId(), e.getName(), e.getSalary(), e.getDepartmentName());
        return employeeResponseModel;
    }

}
