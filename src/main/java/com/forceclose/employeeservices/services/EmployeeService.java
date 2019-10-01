package com.forceclose.employeeservices.services;

import com.forceclose.employeeservices.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee register(Employee employee);
}
