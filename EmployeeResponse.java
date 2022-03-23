package com.example.springmongodb.dto;

import com.example.springmongodb.entity.Address;
import com.example.springmongodb.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmployeeResponse {

    private String name;
    private int doorno;
    private String street;
    private String city;
    private String state;
}
