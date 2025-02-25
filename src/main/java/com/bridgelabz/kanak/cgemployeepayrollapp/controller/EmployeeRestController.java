package com.bridgelabz.kanak.cgemployeepayrollapp.controller;

import com.bridgelabz.kanak.cgemployeepayrollapp.dto.Employee;
import com.bridgelabz.kanak.cgemployeepayrollapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emplo")
public class EmployeeRestController {
    @Autowired
    private EmployeeRepository employeeRepository;
    @GetMapping()
    public List<Employee> employee() {
        return employeeRepository.findAll();
    }
    @GetMapping("/{id}")
    public Employee employeeById(@PathVariable long id) {
        return employeeRepository.findById(id).orElse(null);

    }
    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }
    
    @DeleteMapping("/{id}")
     public void deleteEmployee(@PathVariable long id) {
        employeeRepository.deleteById(id);
    }






}
