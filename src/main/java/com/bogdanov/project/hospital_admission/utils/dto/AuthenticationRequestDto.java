package com.bogdanov.project.hospital_admission.utils.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class AuthenticationRequestDto {
    private String email;
    private String password;
}