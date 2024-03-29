package com.parctice.employeeservice.repository;

import com.parctice.employeeservice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
