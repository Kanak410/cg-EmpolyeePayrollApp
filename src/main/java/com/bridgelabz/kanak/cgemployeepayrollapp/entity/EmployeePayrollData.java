package com.bridgelabz.kanak.cgemployeepayrollapp.entity;

import com.bridgelabz.kanak.cgemployeepayrollapp.dto.EmployeeDTO;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Data
@Entity
@Table(name="Employee_payroll")
public class EmployeePayrollData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="EmployeeID")
    private long id;
    @Column(name="EmployeeName")
    private String name;
    private String salary;
    private String gender;
    private String profilePic;
    private String note;
    private LocalDate startDate;
    @ElementCollection
    @CollectionTable(name="employee_department",joinColumns=@JoinColumn(name="Id"))
    @Column(name="department")
    private List<String> departments;
    public EmployeePayrollData() {

    }
    public EmployeePayrollData(EmployeeDTO employee) {
        this.name = employee.getName();
        this.salary = employee.getSalary();
        this.gender = employee.getGender();
     
        this.note = employee.getNote();
        this.startDate = employee.getStartDate();
        this.profilePic = employee.getProfilePic();
        this.departments = employee.getDepartments();
    }

}
