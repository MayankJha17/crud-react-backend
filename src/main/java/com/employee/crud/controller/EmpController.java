package com.employee.crud.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.employee.crud.dto.EmployeeDto;
import com.employee.crud.model.Employee;
import com.employee.crud.service.EmpService;

@RequestMapping("/employee")
@RestController
public class EmpController {

    @Autowired
    EmpService service;

    @PostMapping("/")
    public ResponseEntity<String> Welcome() {
        return new ResponseEntity<>("Welcome", HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Object> getEmployeeBYId(@PathVariable("id") String id) {
        Employee emp = service.findById(id);
        if (emp == null) {
            return new ResponseEntity<>("Not Found", HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(emp, HttpStatus.OK);
        }
    }

    @PostMapping("/create")
    public ResponseEntity<String> addEmployee(@RequestBody Employee emp) {
        return new ResponseEntity<>(service.addEmployee(emp), HttpStatus.OK);
    }

    @PostMapping("/all")
    public ResponseEntity<Object> listOfEmployee() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
}
