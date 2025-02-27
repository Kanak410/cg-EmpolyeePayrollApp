package com.bridgelabz.kanak.cgemployeepayrollapp.entity;

import com.bridgelabz.kanak.cgemployeepayrollapp.dto.EmployeeDTO;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="Employee_payroll")
public class EmployeePayrollData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="EmployeeName")
    private String name;
    private String salary;
    private String gender;
    private String profilePic;
    private String note;
    private LocalDate startDate;
    public EmployeePayrollData() {

    }
    public EmployeePayrollData(EmployeeDTO employee) {
        this.name = employee.getName();
        this.salary = employee.getSalary();
        this.gender = employee.getGender();
        this.profilePic = employee.getProfilePic();
        this.note = employee.getNote();
        this.startDate = employee.getStartDate();
        this.profilePic = employee.getProfilePic();
    }

}
