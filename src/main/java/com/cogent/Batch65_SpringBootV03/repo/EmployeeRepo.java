package com.cogent.Batch65_SpringBootV03.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cogent.Batch65_SpringBootV03.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

	//by default Lots of Methods Available that will do Some 
	//Magic to deal with database Connect and Query....by differen ways


}
