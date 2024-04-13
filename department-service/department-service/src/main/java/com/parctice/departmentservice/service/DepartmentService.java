package com.parctice.departmentservice.service;

import com.parctice.departmentservice.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);
    Department getDepartment(String departmentCode);
    List<Department> getAllDepartments();
}
