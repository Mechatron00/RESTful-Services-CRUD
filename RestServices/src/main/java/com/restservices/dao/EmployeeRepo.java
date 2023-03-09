package com.restservices.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restservices.bean.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>
{

}
