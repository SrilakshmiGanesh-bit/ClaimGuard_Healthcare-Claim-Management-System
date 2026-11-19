package com.claimguard.dto;

import com.claimguard.enums.Gender;

import java.time.LocalDate;

public record PatientResponse(
        Long id,
        String name,
        LocalDate dob,
        Gender gender
        ) {
}
