package com.parctice.employeeservice.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationDto {

    private Long id;

    private String organizationName;

    private String organizationCode;
    private String organizationDescription;
    private LocalDateTime createdDate;
}
