package com.postgres.assignment2.services;

import com.postgres.assignment2.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public void saveEmployee(Employee employee);

    public void removeEmployee(Employee employee);

    public Employee findName(String name);

    public List<Employee> showEmployee();
}
