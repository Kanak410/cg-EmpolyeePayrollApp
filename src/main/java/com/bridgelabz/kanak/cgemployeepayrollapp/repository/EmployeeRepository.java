package com.bridgelabz.kanak.cgemployeepayrollapp.repository;

import com.bridgelabz.kanak.cgemployeepayrollapp.dto.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
