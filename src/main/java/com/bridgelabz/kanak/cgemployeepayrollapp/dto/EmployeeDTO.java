package com.bridgelabz.kanak.cgemployeepayrollapp.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.*;

import java.time.LocalDate;


@Data
@NoArgsConstructor
public class EmployeeDTO {



    @NotBlank(message="Name should not be empty")
    @NotNull
    @Pattern(regexp = "^[A-Za-z ]+$",message = "Only alphabets and space allowed")

    private String name;
    @Min(value = 10000, message = "minimum wage should be 10000")
    private String salary;
    @Pattern(regexp = "male|female",message = "Gender should be male or female")
    private String gender;
    @NotBlank(message = "profile pic should be there")
    private String profilePic;
    @NotBlank(message = "note cannot be empty")
    private String note;

    @JsonFormat(pattern = "dd-MM-yyyy")
    @NotNull(message = "start date should not be empty")
    @PastOrPresent(message = "start date should be past or today!! Enter the date")
    private LocalDate startDate;
    private List<String> departments;




}
