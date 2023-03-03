package com.cogent.Batch65_SpringBootV03.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.Batch65_SpringBootV03.entity.Employee;
import com.cogent.Batch65_SpringBootV03.repo.EmployeeRepo;
import com.cogent.Batch65_SpringBootV03.service.EmployeeService;

@RestController
public class EmployeeControler {

//	HTTP Methods
//	   GET
//	   POST
//	   DELETE
//	   PUT
	
	@Autowired
	EmployeeRepo employeeRepository;
//	EmployeeService employeeService;
	

	@PostMapping("addemp")
	public Employee addEmployee(@RequestBody Employee newEmployee) {
		System.out.println("Success Add!!!!");
		return employeeRepository.save(newEmployee);
	}

//	@GetMapping("getemp")
//	public List<Employee> getEmployee() {
//		
//	return employeeRepository.findAll();
//		
//	}
//	
	@GetMapping("getemp")
	public List<Employee> getEmployee() {
		System.out.println("Success findAll!!!");
		return employeeRepository.findAll();
	}


	@PutMapping
	void updateEmployee() {

	}

	// https://www.tutorialspoint.com/spring_boot_h2/spring_boot_h2_delete_record.htm
	@DeleteMapping("delemp/{id}")
	void deleteEmployee(@PathVariable("id") int empid) {
		System.out.println("Success Delete!!!");
//		employeeService.deleteEmployeeById(empid);
		employeeRepository.deleteById(empid);
		// use delete!!
	}

}
