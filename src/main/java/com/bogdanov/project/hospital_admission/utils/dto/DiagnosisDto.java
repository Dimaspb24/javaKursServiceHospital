package com.bogdanov.project.hospital_admission.utils.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@AllArgsConstructor
@Builder
@Data
public class DiagnosisDto {

    private Long id;

    private String name;

//    private Set<PersonDto> persons;
}
