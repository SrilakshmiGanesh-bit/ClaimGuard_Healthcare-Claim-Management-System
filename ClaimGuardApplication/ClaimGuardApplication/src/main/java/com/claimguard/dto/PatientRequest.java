package com.claimguard.dto;

import com.claimguard.enums.Gender;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public record PatientRequest(
    @NotBlank(message = "Name is required")
    @Size(max = 100, message = "Name must be less than 100 characters")
    String name,

    @NotNull(message = "DOB is required")
    @Past(message = "DOB must be in the past")
    LocalDate dob,

    @NotNull(message = "Gender is required")
    Gender gender
    ){

}
