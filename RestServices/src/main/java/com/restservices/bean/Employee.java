package com.restservices.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

@Entity
public class Employee 
{

	@Id
	private Integer eid;
	@Size(min = 3)
	private String ename;
	@Past
	private Date dob=new Date();
	
	private Double salary;
	
	
	
	
	public Employee() {
		super();
	}
	public Employee(Integer eid, String ename, Date dob, Double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.dob = dob;
		this.salary = salary;
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	
	
	
	
	
	
	
	
	
}
