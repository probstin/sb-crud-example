package com.example.demo.controller;

public class EmployeeNotFoundException extends RuntimeException {

    public EmployeeNotFoundException(Long id) {
        super("Could not find employee with ID: " + id);
    }
    
}
