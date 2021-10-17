package com.sysm.test.service;

import com.sysm.test.model.Employee;
import com.sysm.test.pojo.EmployeeDTO;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getEmployeeList();
    public Employee saveEmployee(EmployeeDTO employeeDTO);

    public Employee updateEmployee(EmployeeDTO employeeDTO);
}
