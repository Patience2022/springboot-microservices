package com.parctice.employeeservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long employeeId;
    @Column(nullable = false)
    private String employeeName;
    @Column(nullable = false)
    private String employeeLastName;
    @Column(nullable = false, unique = true)
    private String employeeEmail;
    @Column(nullable = false)
    private String departmentCode;
    @Column(nullable = false)
    private String organizationCode;
}
