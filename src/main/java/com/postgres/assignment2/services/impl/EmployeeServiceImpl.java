package com.postgres.assignment2.services.impl;

import com.postgres.assignment2.entity.Employee;
import com.postgres.assignment2.repository.EmployeeRepository;
import com.postgres.assignment2.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void removeEmployee(Employee employee) {
        employeeRepository.delete(employee);
    }

    @Override
    public Employee findName(String name) {
        return employeeRepository.findByName(name);
    }

    @Override
    public List<Employee> showEmployee() {
        return employeeRepository.findAll();
    }
}
