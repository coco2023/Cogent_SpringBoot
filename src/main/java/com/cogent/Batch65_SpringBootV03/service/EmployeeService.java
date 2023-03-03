package com.cogent.Batch65_SpringBootV03.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.Batch65_SpringBootV03.entity.Employee;
import com.cogent.Batch65_SpringBootV03.repo.EmployeeRepo;

@Service
public class EmployeeService {
	   @Autowired
	   EmployeeRepo repository;
	   public Employee getEmployeeById(int id) {
	      return repository.findById(id).get();
	   }
	   public List<Employee> getAllEmployees(){
	      List<Employee> employees = new ArrayList<Employee>();
	      repository.findAll().forEach(employee -> employees.add(employee));
	      return employees;
	   }
	   public void saveOrUpdate(Employee employee) {
	      repository.save(employee);
	   }
	   public void deleteEmployeeById(int id) {
	      repository.deleteById(id);
	   }

}
