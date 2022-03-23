package com.example.springmongodb.repository;

import com.example.springmongodb.entity.Address;
import com.example.springmongodb.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee,Integer> {

}
