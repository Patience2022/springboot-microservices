package com.parctice.employeeservice.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmployeeDto {
    private long employeeId;
    private String employeeName;
    private String employeeLastName;
    private String employeeEmail;
    private String departmentCode;
    private String organizationCode;
}
