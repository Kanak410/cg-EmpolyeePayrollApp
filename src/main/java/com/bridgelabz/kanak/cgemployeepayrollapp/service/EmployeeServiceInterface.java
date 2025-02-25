package com.bridgelabz.kanak.cgemployeepayrollapp.service;

import com.bridgelabz.kanak.cgemployeepayrollapp.dto.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface EmployeeServiceInterface {
    public List<Employee> getEmployees();
    public Employee getEmployee( long id);
    public Employee addEmployee(String name,String salary);
    ResponseEntity<String> deleteEmployee(long id);

}
