package com.sysm.test.service.impl;

import com.sysm.test.dao.EmployeeRepository;
import com.sysm.test.model.Employee;
import com.sysm.test.pojo.EmployeeDTO;
import com.sysm.test.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getEmployeeList() {

        List<Employee> employeeList=null;

        try{
            employeeList=  employeeRepository.findAll();

        }catch (Exception e){
           e.printStackTrace();
        }
        return employeeList;
    }

    @Override
    public Employee saveEmployee(EmployeeDTO employeeDTO) {

        Employee employee=null;
        try{
            employee=new Employee();
            employee.setFirstName(employeeDTO.getFirstName());
            employee.setLastName(employeeDTO.getLastName());
            employee.setSalary(employeeDTO.getSalary());

            employee= employeeRepository.save(employee);
        }catch (Exception e){

        }


        return employee;
    }

    @Override
    public Employee updateEmployee(EmployeeDTO employeeDTO) {

      Employee employee=null;
        try{
            employee=employeeRepository.getById(employeeDTO.getId());

            employee.setId(employeeDTO.getId());
            employee.setFirstName(employeeDTO.getFirstName());
            employee.setSalary(employeeDTO.getSalary());
            employee= employeeRepository.save(employee);

        }catch (Exception e){
            e.printStackTrace();
        }

        return employee;
    }


}
