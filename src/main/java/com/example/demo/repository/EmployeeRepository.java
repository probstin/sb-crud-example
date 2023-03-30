package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.domain.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query(value = "select nextval employee_sequence", nativeQuery = true)
    Long nextId();

}
