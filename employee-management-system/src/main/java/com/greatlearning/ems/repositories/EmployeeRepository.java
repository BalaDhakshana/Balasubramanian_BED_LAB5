package com.greatlearning.ems.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.ems.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
