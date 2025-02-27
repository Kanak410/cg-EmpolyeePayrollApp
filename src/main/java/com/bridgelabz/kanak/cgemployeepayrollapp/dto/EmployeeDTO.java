package com.bridgelabz.kanak.cgemployeepayrollapp.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@NoArgsConstructor
public class EmployeeDTO {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Long id;
    @NotBlank(message="Name should not be empty")
    @NotNull
    @Pattern(regexp = "^[A-Za-z ]+$",message = "Only alphabets and space allowed")
    private String name;
    private String salary;
    private String gender;
    private String profilePic;
    private String note;
    private LocalDate startDate;




}
