package com.example.demoTwo;

import java.util.UUID;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demoTwo.model.Employee;
import com.example.demoTwo.repository.EmployeeRepository;

@SpringBootApplication
public class DemoTwoApplication {

	@Bean
	CommandLineRunner employees(EmployeeRepository  employeeRepository) {

		return args -> {
			employeeRepository
					.deleteAll()
					.subscribe(null, null, () -> {

						Stream.of(new Employee(UUID.randomUUID().toString(), "Samuel", 12000L),
								new Employee(UUID.randomUUID().toString(), "Dana", 13000L),
								new Employee(UUID.randomUUID().toString(), "Paul", 20000L),
								new Employee(UUID.randomUUID().toString(), "Denis", 33000L),
								new Employee(UUID.randomUUID().toString(), "Darpal", 100000L)
						)
								.forEach(employee -> {
									employeeRepository
											.save(employee)
											.subscribe(System.out::println);
								});
					});
		};
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoTwoApplication.class, args);
	}
}

