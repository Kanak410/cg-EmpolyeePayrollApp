package com.bridgelabz.kanak.cgemployeepayrollapp.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Employee {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Long id;
    @NotBlank(message="Name should not be empty")
    @NotNull
    @Pattern(regexp = "^[A-Za-z ]+$",message = "Only alphabets and space allowed")
    private String name;
    private String salary;

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getSalary() {
//        return salary;
//    }
//
//    public void setSalary(String salary) {
//        this.salary = salary;
//    }
//
//    public Employee() {
//    }
//
    public Employee(String name, String salary) {
        this.name = name;
        this.salary = salary;
    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Long getId() {
//        return id;
//    }

}
