package com.restservices.resources;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.restservices.bean.Employee;
import com.restservices.dao.EmployeeRepo;

@RestController
public class EmployeeResource 
{
	@Autowired
	private EmployeeRepo repo;
	
	
	@GetMapping("/home")
	public String home()
	{
		return "Homepage Working";
	}

	
	@GetMapping("/allemployees")
	public List<Employee> getAllEmployee()
	{
		return repo.findAll();
	}
	
	@GetMapping("/getbyid/{eid}")
	public Employee getById(@PathVariable int eid)
	{
		Employee emp=repo.findById(eid).orElse(new Employee());
		return emp;
	}
	
	@PostMapping("/addemployee")
	public void addEmployee(@Valid @RequestBody Employee employee)
	{
//		if(employee==null)
//		{
//			return "Employee data cant be empty....!!!";
//		}
		repo.save(employee);
//		return "addEmployee.html";
		
	}
}
