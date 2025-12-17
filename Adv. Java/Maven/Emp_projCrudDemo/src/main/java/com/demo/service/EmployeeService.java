package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	boolean addNewEmployee();

	List<Employee> getAllEmployee();

	boolean deleteById(int empid);

	boolean updateEmployeeById(int empid, String ename, double sal);
	
	boolean addProjectToEmployee(int eid, int pid);

	List<Employee> SortEmployeeBySalary();

	void closeMySessionFactory();

}
