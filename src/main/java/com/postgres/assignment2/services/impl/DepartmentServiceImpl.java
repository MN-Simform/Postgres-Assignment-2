package com.postgres.assignment2.services.impl;

import com.postgres.assignment2.entity.Department;
import com.postgres.assignment2.repository.DepartmentRepository;
import com.postgres.assignment2.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public void saveDepartment(List<Department> departments) {
        departmentRepository.saveAll(departments);
    }

    @Override
    public void removeDepartment(Department department) {
        departmentRepository.delete(department);
    }

    @Override
    public List<Department> showDepartment() {
        return departmentRepository.findAll();
    }

    @Override
    public Department findDeptId(Integer dept_id) {
        return departmentRepository.findDept(dept_id);
    }
}
