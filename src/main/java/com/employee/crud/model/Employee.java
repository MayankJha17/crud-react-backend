package com.employee.crud.model;

import org.springframework.data.mongodb.core.mapping.Document;

import com.employee.crud.dto.EmployeeDto;
import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection = "info")
public class Employee {
    
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private String id;
    private String name;

    public Employee(){
        super();
    }

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
