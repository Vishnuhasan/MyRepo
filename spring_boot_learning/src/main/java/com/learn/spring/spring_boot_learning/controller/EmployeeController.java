package com.learn.spring.spring_boot_learning.controller;

import com.learn.spring.spring_boot_learning.dto.*;
import com.learn.spring.spring_boot_learning.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    @ResponseStatus(HttpStatus.CREATED)
    public EmployeeResponseDTO add(@RequestBody EmployeeRequestDTO request){
        if (request.getId()==0)
            throw new RestException("Invalid Id, Id should not = to 0");
        return empService.createEmployee(request);
    }

    @RequestMapping("/all-employees")
    public List<EmployeeResponseDTO> getALlEmployees(){
        return empService.getAllEmployees();
    }

    @RequestMapping()
    public EmployeeResponseDTO getEmployeeBasedOnId(@RequestParam int id){
        return empService.getEmployeeBasedOnId(id);
    }

    @PutMapping("/employee")
     public EmployeeResponseDTO updateEmployee(@RequestParam int id,@RequestBody EmployeeRequestDTO request){
        return empService.updateEmployee(id, request);
    }

    @DeleteMapping("/employee")
    public DeleteEmployeeResponse deleteEmployee(@RequestBody DeleteEmployeeRequest request){
        return empService.deleteEmployee(request);
    }

}
