package com.parctice.employeeservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class APIResponseEntity {

    private EmployeeDto employee;
    private DepartmentDto department;
    private OrganizationDto organizationD;

}
