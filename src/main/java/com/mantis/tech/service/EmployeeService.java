package com.mantis.tech.service;

import com.mantis.tech.model.Employee;
import com.mantis.tech.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public void createOrUpdate(Employee employee) {
        employeeRepository.save(employee);
    }

    public void deleteEmployee(Integer id) {
        Employee employee = this.findById(id);
        if (employee != null)
            employeeRepository.delete(employee);
    }

    public Employee findById(Integer employeeId) {
        Optional<Employee> employee = employeeRepository.findById(employeeId);
        if (employee.isPresent()) return employee.get();
        return null;
    }

    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

}
