package com.bridgelabz.kanak.cgemployeepayrollapp.service;

import com.bridgelabz.kanak.cgemployeepayrollapp.dto.Employee;
import com.bridgelabz.kanak.cgemployeepayrollapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements EmployeeServiceInterface {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public List<Employee> getEmployees(){
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployee(long id) {
        return employeeRepository.findById(id).orElse(null);
    }
    @Override
    public Employee addEmployee(String name,String salary) {
        return employeeRepository.save(new Employee(name,salary));
    }
    @Override
    public ResponseEntity<String> deleteEmployee(long id) {
        if(employeeRepository.existsById(id)) {
            employeeRepository.deleteById(id);
            return ResponseEntity.ok("Employee deleted sucessfully");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Employee not found with id"+id);
    }

    @Override
    public Employee updateEmployeeSalary(Long id,String name, String salary){
        Employee employee = employeeRepository.findById(id).get();
        if(employeeRepository.existsById(id)){
            employee.setSalary(salary);
            employee.setName(name);
            return employeeRepository.save(employee);
        }
        return null;

    }



}
