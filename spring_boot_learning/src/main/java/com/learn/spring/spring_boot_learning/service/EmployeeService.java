package com.learn.spring.spring_boot_learning.service;

import com.learn.spring.spring_boot_learning.dto.*;
import java.util.List;

public interface EmployeeService {
     EmployeeResponseDTO createEmployee(EmployeeRequestDTO empRequest);
     List<EmployeeResponseDTO> getAllEmployees();
     EmployeeResponseDTO getEmployeeBasedOnId(int id);
     EmployeeResponseDTO updateEmployee(int id, EmployeeRequestDTO empRequest);
     DeleteEmployeeResponse deleteEmployee(DeleteEmployeeRequest request);
}
