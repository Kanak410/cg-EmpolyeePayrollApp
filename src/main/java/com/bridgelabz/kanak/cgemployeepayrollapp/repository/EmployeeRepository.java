package com.bridgelabz.kanak.cgemployeepayrollapp.repository;

import com.bridgelabz.kanak.cgemployeepayrollapp.dto.EmployeeDTO;
import com.bridgelabz.kanak.cgemployeepayrollapp.entity.EmployeePayrollData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<EmployeePayrollData,Long> {
    @Query(value = "SELECT ep.* FROM employee_payroll ep " +
            "JOIN employee_department ed ON ep.employeeid = ed.id " +
            "WHERE ed.department = :department", nativeQuery = true)
    List<EmployeePayrollData> findEmployeePayrollDataByDepartments(String department);
}
