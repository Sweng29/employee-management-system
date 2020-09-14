package com.mantis.tech.controller;

import com.mantis.tech.dto.ResponseEntity;
import com.mantis.tech.model.Employee;
import com.mantis.tech.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "v1/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Employee> findAllEmployees() {
        List<Employee> employeeList = employeeService.findAllEmployees();
        ResponseEntity<Employee> employeeResponseEntity = new ResponseEntity<>();
        employeeResponseEntity.setMessage("Employees loaded successfully.");
        employeeResponseEntity.setResponseCode("200");
        employeeResponseEntity.setResult(employeeList.toArray());
        return employeeResponseEntity;
    }


}
