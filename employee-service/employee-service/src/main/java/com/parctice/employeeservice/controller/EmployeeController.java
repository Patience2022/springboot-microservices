package com.parctice.employeeservice.controller;

import com.parctice.employeeservice.dto.APIResponseEntity;
import com.parctice.employeeservice.dto.EmployeeDto;
import com.parctice.employeeservice.entity.Employee;
import com.parctice.employeeservice.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/employee")
@AllArgsConstructor
public class EmployeeController {

    private ModelMapper modelMapper;
    private EmployeeService employeeService;

    @PostMapping
    public EmployeeDto addEmployee(@RequestBody EmployeeDto employeeDto){
        Employee employee = modelMapper.map(employeeDto, Employee.class);
        return modelMapper.map(employeeService.createEmployee(employee), EmployeeDto.class);
    }

    @GetMapping("/{employeeId}")
    public APIResponseEntity getEmployee(@PathVariable long employeeId){
       return employeeService.getEmployee(employeeId) ;
    }

    @GetMapping

    public List<EmployeeDto> getEmployees(){
        return null;
    }
}
