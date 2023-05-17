package com.postgres.assignment2.controller;

import com.postgres.assignment2.entity.Department;
import com.postgres.assignment2.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @RequestMapping("/")
    public List<Department> findAllDept(){
        return departmentService.showDepartment();
    }

    @RequestMapping("/add_dept")
    public String storeData(@RequestBody List<Department> departments){
        if(departments != null){
            departmentService.saveDepartment(departments);
            return "Success";
        }
        return "Failed";
    }

    @RequestMapping("/remove_dept/{id}")
    public String deletedDept(@PathVariable Integer id){
        if(id != null){
            departmentService.removeDepartment(departmentService.findDeptId(id));
            return "Success";
        }
        return "Failed";
    }
}
