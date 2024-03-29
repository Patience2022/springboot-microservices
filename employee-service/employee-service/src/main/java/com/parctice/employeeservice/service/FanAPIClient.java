package com.parctice.employeeservice.service;

import com.parctice.employeeservice.dto.DepartmentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "http://localhost:8080", value = "DEPARTMENT-SERVICE")
public interface FanAPIClient {

    @GetMapping("api/v1/department/{departmentCode}")
    DepartmentDto getDepartment(@PathVariable String departmentCode);
}
