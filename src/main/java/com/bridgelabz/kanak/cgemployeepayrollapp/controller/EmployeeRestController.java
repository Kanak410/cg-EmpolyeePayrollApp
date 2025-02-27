package com.bridgelabz.kanak.cgemployeepayrollapp.controller;

import com.bridgelabz.kanak.cgemployeepayrollapp.dto.EmployeeDTO;
import com.bridgelabz.kanak.cgemployeepayrollapp.entity.EmployeePayrollData;
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
    @PostMapping("/add")
    public EmployeePayrollData addEmployee(@RequestBody EmployeeDTO employeeDTO) {
        log.info("Adding employee ");
        return employeeService.addEmployee(employeeDTO);

    }










}
