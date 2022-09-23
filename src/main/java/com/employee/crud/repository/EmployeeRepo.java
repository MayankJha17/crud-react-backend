package com.employee.crud.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.employee.crud.model.Employee;

public interface EmployeeRepo extends MongoRepository<Employee,String>{

    boolean existsByName(String name);
  
    
}