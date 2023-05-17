package com.postgres.assignment2.controller;

import com.postgres.assignment2.dto.EmployeeDto;
import com.postgres.assignment2.entity.Employee;
import com.postgres.assignment2.services.DepartmentService;
import com.postgres.assignment2.services.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    DepartmentService departmentService;

    @Autowired
    ModelMapper modelMapper;

    @RequestMapping("/")
    public List<Employee> showEmp(){
        return employeeService.showEmployee();
    }

    @RequestMapping(value = "/add_employee", method = RequestMethod.POST)
    public String addEmp(@RequestBody EmployeeDto employeeDto){
        if(employeeDto != null){
            Employee employee = modelMapper.map(employeeDto, Employee.class);
            employee.setDeptId(departmentService.findDeptId(employeeDto.getDeptId()));
            employeeService.saveEmployee(employee);
            return "Success";
        }
        return "Failed";
    }

    @RequestMapping(value = "/remove_employee/{name}", method = RequestMethod.POST)
    public String dltEmp(@PathVariable String name){
        if(name != null){
            employeeService.removeEmployee(employeeService.findName(name));
            return "Success";
        }
        return "Failed";
    }
}
