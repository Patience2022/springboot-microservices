package com.parctice.employeeservice.service.impl;

import com.parctice.employeeservice.dto.APIResponseEntity;
import com.parctice.employeeservice.dto.DepartmentDto;
import com.parctice.employeeservice.dto.EmployeeDto;
import com.parctice.employeeservice.entity.Employee;
import com.parctice.employeeservice.repository.EmployeeRepository;
import com.parctice.employeeservice.service.EmployeeService;
import com.parctice.employeeservice.service.FanAPIClient;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
//    private RestTemplate restTemplate;
    private ModelMapper modelMapper;
//    private WebClient webClient;
    private FanAPIClient fanAPIClient;
    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }


//  Using Rest Template to make an API Call

//    @Override
//    public APIResponseEntity getEmployee(long employeeId) {
//        Employee employee = employeeRepository.findById(employeeId).orElseThrow(
//                ()->new RuntimeException("No employee with given ID was found"));;
//
//       ResponseEntity<DepartmentDto> responseEntity = restTemplate.
//               getForEntity("http://localhost:8080/api/v1/department/"+employee.getDepartmentCode(),
//                       DepartmentDto.class);
//       DepartmentDto departmentDto = responseEntity.getBody();
//
//        APIResponseEntity apiResponse = new APIResponseEntity();
//        apiResponse.setEmployee(modelMapper.map(employee, EmployeeDto.class));
//        apiResponse.setDepartment(departmentDto);
//
//
//        return apiResponse;
//    }

//    USING WEBCLIENT TO MAKE A REST API CALL
//    @Override
//    public APIResponseEntity getEmployee(long employeeId) {
//        Employee employee = employeeRepository.findById(employeeId).orElseThrow(
//                ()->new RuntimeException("No employee with given ID was found"));;
//
//        DepartmentDto departmentDto = webClient.get()
//                .uri("http://localhost:8080/api/v1/department/"+employee.getDepartmentCode())
//                .retrieve()
//                .bodyToMono(DepartmentDto.class)
//                .block();
//
//        APIResponseEntity apiResponse = new APIResponseEntity();
//        apiResponse.setEmployee(modelMapper.map(employee, EmployeeDto.class));
//        apiResponse.setDepartment(departmentDto);
//
//
//        return apiResponse;
//    }

//    USING OPEN FEIGN TO MAKE A REST CALL
    @Override
    public APIResponseEntity getEmployee(long employeeId) {
        Employee employee = employeeRepository.findById(employeeId).orElseThrow(
                ()->new RuntimeException("No employee with given ID was found"));;

        DepartmentDto departmentDto = fanAPIClient.getDepartment(employee.getDepartmentCode());

        APIResponseEntity apiResponse = new APIResponseEntity();
        apiResponse.setEmployee(modelMapper.map(employee, EmployeeDto.class));
        apiResponse.setDepartment(departmentDto);


        return apiResponse;
    }
    @Override
    public List<Employee> getAllEmployees() {
        return null;
    }

    @Override
    public List<Employee> getEmployeesByName(String employeeName) {
        return null;
    }

    @Override
    public List<Employee> getEmployeesByLastName(String LastName) {
        return null;
    }
}
