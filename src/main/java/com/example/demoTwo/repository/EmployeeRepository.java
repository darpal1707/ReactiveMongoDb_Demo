package com.example.demoTwo.repository;

import com.example.demoTwo.model.Employee;
import com.example.demoTwo.repository.EmployeeRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface EmployeeRepository extends ReactiveMongoRepository<Employee, String> {
}
