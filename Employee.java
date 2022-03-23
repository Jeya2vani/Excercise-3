package com.example.springmongodb.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "Employee")
public class Employee {
    @Id
    private int id;
    private String name;
    private String department;
    private int salary;
    private int percent;
}
