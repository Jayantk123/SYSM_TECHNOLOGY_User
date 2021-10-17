package com.sysm.test.dao;

import com.sysm.test.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}

