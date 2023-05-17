package com.postgres.assignment2.repository;

import com.postgres.assignment2.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    @Query("select e from Employee e where e.empName=?1")
    public Employee findByName(String name);
}
