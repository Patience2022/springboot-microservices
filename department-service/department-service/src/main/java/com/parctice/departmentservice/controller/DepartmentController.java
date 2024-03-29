package com.parctice.departmentservice.controller;

import com.parctice.departmentservice.dto.DepartmentDto;
import com.parctice.departmentservice.entity.Department;
import com.parctice.departmentservice.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/department")
public class DepartmentController {
    private DepartmentService departmentService;
    private ModelMapper modelMapper;
    @PostMapping
    public ResponseEntity<DepartmentDto> addDepartment(@RequestBody DepartmentDto departmentDto){
        Department department = modelMapper.map(departmentDto,Department.class);
        DepartmentDto savedDepartment = modelMapper.map(departmentService.saveDepartment(department),DepartmentDto.class);
        return new ResponseEntity<>(savedDepartment, HttpStatus.CREATED);
    }

    @GetMapping("/{departmentCode}")
    public DepartmentDto getDepartment(@PathVariable String departmentCode){
        return modelMapper.map(departmentService.getDepartment(departmentCode),DepartmentDto.class);
    }

    @GetMapping
    public List<Department> getAllDepartments(){
        return departmentService.getAllDepartments();
    }
}
