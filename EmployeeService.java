package com.example.springmongodb.service;

import com.example.springmongodb.dto.EmployeeResponse;
import com.example.springmongodb.entity.Address;
import com.example.springmongodb.entity.Employee;
import com.example.springmongodb.repository.AddressRepository;
import com.example.springmongodb.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private AddressRepository addressRepository;

    public List<EmployeeResponse> getEmployeeAdress()
    {
        List<Employee> employeeList=employeeRepository.findAll();
        List<Address> addressList=addressRepository.findAll();
        List<EmployeeResponse> employeeResponses = new ArrayList<EmployeeResponse>();
        employeeList.stream().forEach(employee -> {
            addressList.stream().forEach(address -> {
                if(employee.getId()== address.getId()) {
                    EmployeeResponse employeeResponse = new EmployeeResponse();
                    employeeResponse.setName(employee.getName());
                    employeeResponse.setDoorno(address.getDoorno());
                    employeeResponse.setStreet(address.getStreet());
                    employeeResponse.setCity(address.getCity());
                    employeeResponse.setState(address.getState());
                    employeeResponses.add(employeeResponse);
                }
            });});
        return employeeResponses;
    }
}
