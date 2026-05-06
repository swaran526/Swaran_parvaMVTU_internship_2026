package com.employee.Employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.Employee.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // Spring Data JPA magic happens here
}