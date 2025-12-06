package com.demo.service;

public interface EmployeeService {

	void readFile(String fname);
	
	boolean addNewEmployee();

	boolean deleteById(int empid);

}
