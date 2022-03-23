package com.example.springmongodb.controller;

import com.example.springmongodb.dto.EmployeeResponse;
import com.example.springmongodb.entity.Address;
import com.example.springmongodb.entity.Employee;
import com.example.springmongodb.repository.AddressRepository;
import com.example.springmongodb.repository.EmployeeRepository;
import com.example.springmongodb.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("EmployeeDetails")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employee-address")
    public List<EmployeeResponse> getEmployeeAddress(){
        return employeeService.getEmployeeAdress();
    }
}
