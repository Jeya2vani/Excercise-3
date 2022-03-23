package com.example.springmongodb.repository;

import com.example.springmongodb.entity.Address;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AddressRepository extends MongoRepository<Address,Integer> {
}
