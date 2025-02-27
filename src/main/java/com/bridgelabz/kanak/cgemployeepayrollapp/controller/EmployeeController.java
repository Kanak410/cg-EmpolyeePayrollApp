package com.bridgelabz.kanak.cgemployeepayrollapp.controller;


import org.springframework.ui.Model;
import com.bridgelabz.kanak.cgemployeepayrollapp.dto.EmployeeDTO;
import com.bridgelabz.kanak.cgemployeepayrollapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;

    // Show Employee Page
    @GetMapping
    public String showEmployees(Model model) {
        model.addAttribute("employees", repository.findAll());
        return "employee";
    }

    // Add Employee
    @PostMapping("/add")
    public String addEmployee(@RequestParam String name, @RequestParam String salary) {
        EmployeeDTO employee = new EmployeeDTO(name, salary);
        repository.save(employee);
        return "redirect:/employee";
    }

    // Delete Employee
    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        repository.deleteById(id);
        return "redirect:/employee";
    }


}