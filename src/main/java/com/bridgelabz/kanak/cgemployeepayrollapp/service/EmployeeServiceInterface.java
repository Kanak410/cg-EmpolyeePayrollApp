package com.bridgelabz.kanak.cgemployeepayrollapp.service;

import com.bridgelabz.kanak.cgemployeepayrollapp.dto.EmployeeDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EmployeeServiceInterface {
    public List<EmployeeDTO> getEmployees();
    public EmployeeDTO getEmployee(long id);
    public EmployeeDTO addEmployee(String name, String salary);
    ResponseEntity<String> deleteEmployee(long id);
    EmployeeDTO updateEmployeeSalary(Long id, String name, String salary);

}
