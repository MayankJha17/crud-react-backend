package com.employee.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.employee.crud.model.Employee;
import com.employee.crud.repository.EmployeeRepo;

@Service
public class EmpService {

    @Autowired
    EmployeeRepo repo;

    public Employee findById(String id) {
        Optional<Employee> opEmployee = repo.findById(id);
        if (opEmployee.isPresent()) {
            return opEmployee.get();
        } else {
            return null;
        }

    }

    public String addEmployee(Employee emp) {
        if (repo.existsByName(emp.getName())) {
            return "Employee already exists";
        } else {
            repo.save(emp);
            return "Employee save successfully";
        }
    }

    public List<Employee> getAll(){
        return repo.findAll();
    }

}
