package com.postgres.assignment2.dto;

import lombok.Data;

import java.util.Date;

@Data
public class EmployeeDto {
    private Integer empId;
    private String empName;
    private Date empDob;
    private String empSal;
    private Integer deptId;
}