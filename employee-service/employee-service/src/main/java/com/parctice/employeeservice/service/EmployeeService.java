package com.parctice.employeeservice.service;

import com.parctice.employeeservice.dto.APIResponseEntity;
import com.parctice.employeeservice.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);
    APIResponseEntity getEmployee(long employeeId);
    List<Employee> getAllEmployees();
    List<Employee> getEmployeesByName(String employeeName);

    List<Employee> getEmployeesByLastName(String LastName);
}
