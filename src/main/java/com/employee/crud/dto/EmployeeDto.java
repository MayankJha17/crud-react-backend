package com.employee.crud.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmployeeDto {

    private String name;



    public EmployeeDto() {
        super();
    }

    public EmployeeDto(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
