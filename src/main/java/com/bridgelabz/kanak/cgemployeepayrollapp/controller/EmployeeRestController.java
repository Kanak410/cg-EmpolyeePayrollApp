package com.bridgelabz.kanak.cgemployeepayrollapp.controller;

import com.bridgelabz.kanak.cgemployeepayrollapp.dto.EmployeeDTO;
import com.bridgelabz.kanak.cgemployeepayrollapp.entity.EmployeePayrollData;
import com.bridgelabz.kanak.cgemployeepayrollapp.service.EmployeeService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
@RestController
@RequestMapping("/emplo")
public class EmployeeRestController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/add")
    public EmployeePayrollData addEmployee(@Valid @RequestBody EmployeeDTO employeeDTO) {
        log.info("Adding employee ");
        return employeeService.addEmployee(employeeDTO);

    }
    @GetMapping()
    public List<EmployeePayrollData> getAllEmployees() {
        return employeeService.getEmployees();
    }
    @GetMapping("/{id}")
    public EmployeePayrollData getEmployee(@PathVariable long id) {
        return employeeService.getEmployee(id);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable long id) {
        return employeeService.deleteEmployee(id);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateEmployee(@PathVariable long id,@Valid @RequestBody EmployeeDTO employeeDTO) {
        return employeeService.updateEmployeeSalary(id,employeeDTO);
    }










}
