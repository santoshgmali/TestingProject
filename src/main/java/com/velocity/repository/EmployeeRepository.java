package com.velocity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
 //connect to db
}
