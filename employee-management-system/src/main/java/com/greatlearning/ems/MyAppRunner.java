package com.greatlearning.ems;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.greatlearning.ems.entities.Employee;
import com.greatlearning.ems.repositories.EmployeeRepository;

@Component
public class MyAppRunner implements CommandLineRunner {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
	/*	Employee e1 = new Employee();
		e1.setFirstName("Komala");
		e1.setLastName("Balasubramanaian");
		e1.setEmail("koms@gl.com");

		Employee e2 = new Employee();
		e2.setFirstName("Dhakshana");
		e2.setLastName("Balasubramanaian");
		e2.setEmail("dhakshu@gl.com");
		employeeRepository.save(e1);
		employeeRepository.save(e2);
		
		*/
	}

}
