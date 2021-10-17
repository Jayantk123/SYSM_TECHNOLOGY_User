package com.sysm.test.controller;

import com.sysm.test.dao.EmployeeRepository;
import com.sysm.test.model.Employee;
import com.sysm.test.pojo.EmployeeDTO;
import com.sysm.test.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/getAllEmp")
    public List<Employee> getEmpolyee(){

        List<Employee> employeeList=null;
        try{
            employeeList=employeeService.getEmployeeList();

        }catch (Exception e){
            e.printStackTrace();
        }

        return employeeList;
    }
    @PostMapping("/saveEmp")
    public Employee getEmpolyee(@RequestBody EmployeeDTO employeeDTO) {

        Employee employee=null;
        employee= employeeService.saveEmployee(employeeDTO);

        return employee;
    }


    @PostMapping("/updateEmp")
    public Employee updateEmpolyee(@RequestBody EmployeeDTO employeeDTO) {

        Employee employee=null;

        employee= employeeService.updateEmployee(employeeDTO);
        return employee;
    }


   @PostMapping("/deleteEmp")
    public Employee deleteEmpolyee(@RequestBody EmployeeDTO employeeDTO) {

        Employee employee=new Employee();
        return employee;
    }
}
