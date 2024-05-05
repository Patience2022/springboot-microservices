package com.parctice.departmentservice.controller;

import com.parctice.departmentservice.dto.DepartmentDto;
import com.parctice.departmentservice.entity.Department;
import com.parctice.departmentservice.service.DepartmentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Department Service - Department Controller",
    description =" Exposes REST APIs for Department Service" )
@RestController
@AllArgsConstructor
@RequestMapping("api/v1/department")
public class DepartmentController {
    private DepartmentService departmentService;
    private ModelMapper modelMapper;

    @Operation(
            summary = "Save Department REST API",
            description = "Save Department REST API is used to save the department object into the database"
    )
    @ApiResponse(
            responseCode = "201",
            description = "HTTP Status 201 Created"
    )
    @PostMapping
    public ResponseEntity<DepartmentDto> addDepartment(@RequestBody DepartmentDto departmentDto){
        Department department = modelMapper.map(departmentDto,Department.class);
        DepartmentDto savedDepartment = modelMapper.map(departmentService.saveDepartment(department),DepartmentDto.class);
        return new ResponseEntity<>(savedDepartment, HttpStatus.CREATED);
    }
    @Operation(
            summary = "Find Department REST API",
            description = "Find Department REST API is used to retrieve the department object from the database using the department code"
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP Status 200 OK"
    )
    @GetMapping("/{departmentCode}")
    public DepartmentDto getDepartment(@PathVariable String departmentCode){
        return modelMapper.map(departmentService.getDepartment(departmentCode),DepartmentDto.class);
    }
    @Operation(
            summary = "Get Departments REST API",
            description = "Get Departments REST API is used to retrieve all departments from the database"
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP Status 200 OK"
    )
    @GetMapping
    public List<Department> getAllDepartments(){
        return departmentService.getAllDepartments();
    }
}
