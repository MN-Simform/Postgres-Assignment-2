package com.postgres.assignment2.services;

import com.postgres.assignment2.entity.Department;

import java.util.List;

public interface DepartmentService {

    public void saveDepartment(List<Department> department);

    public void removeDepartment(Department department);

    public List<Department> showDepartment();

    public Department findDeptId(Integer dept_id);
}
