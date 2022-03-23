package com.example.springmongodb.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "EmployeeAddress")
public class Address {
    @Id
    private int id;
    private int doorno;
    private String street;
    private String city;
    private String state;
}
