package com.bridgelabz.kanak.cgemployeepayrollapp.controller;

import com.bridgelabz.kanak.cgemployeepayrollapp.dto.Employee;
import com.bridgelabz.kanak.cgemployeepayrollapp.repository.EmployeeRepository;
import com.bridgelabz.kanak.cgemployeepayrollapp.service.EmployeeService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
@RestController
@RequestMapping("/emplo")
public class EmployeeRestController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping()
    public List<Employee> employee() {
        log.info("Get employee list");
        return employeeService.getEmployees();
    }
    @GetMapping("/{id}")
    public Employee employeeById(@PathVariable @Valid long id) {
        log.info("Get employee by id");
        return employeeService.getEmployee(id);

    }
    @PostMapping("/add")
    public Employee addEmployee(@Valid @RequestBody Employee employee) {
        log.info("Add employee");
        return employeeService.addEmployee(employee.getName(), employee.getSalary());
    }
    
    @DeleteMapping("/{id}")
     public void deleteEmployee(@PathVariable long id) {
        log.info("Delete employee");
        employeeService.deleteEmployee(id);
    }
    @PutMapping("/update/{id}")
    public Employee updateEmployee(@PathVariable Long id, @Valid @RequestBody Employee employee) {
        log.info("Update employee");
       return employeeService.updateEmployeeSalary(id,employee.getName(), employee.getSalary());

    }







}
