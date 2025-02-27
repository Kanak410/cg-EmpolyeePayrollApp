package com.bridgelabz.kanak.cgemployeepayrollapp.service;

import com.bridgelabz.kanak.cgemployeepayrollapp.dto.EmployeeDTO;
import com.bridgelabz.kanak.cgemployeepayrollapp.entity.EmployeePayrollData;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EmployeeServiceInterface {
    public List<EmployeePayrollData> getEmployees();
    public EmployeePayrollData getEmployee(long id);
    public EmployeePayrollData addEmployee(EmployeeDTO employeeDTO);
    ResponseEntity<String> deleteEmployee(long id);
    ResponseEntity<?> updateEmployeeSalary(long id, EmployeeDTO employeeDTO);

}
