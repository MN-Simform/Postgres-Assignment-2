package com.postgres.assignment2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer empId;
    private String empName;
    private Date empDob;
    private Integer empSal;
    @ManyToOne
    @JoinColumn(
            name="dept_id",
            referencedColumnName = "deptId"
    )
    private Department deptId;
}
