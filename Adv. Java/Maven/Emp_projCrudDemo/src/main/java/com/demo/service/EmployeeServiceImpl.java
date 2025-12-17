package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.beans.Project;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;
import com.demo.dao.ProjectDao;
import com.demo.dao.ProjectDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDao edao;
	private ProjectDao pdao;
	
	
	public EmployeeServiceImpl() {
		this.edao= new EmployeeDaoImpl();
		this.pdao=new ProjectDaoImpl();
	}

	public boolean addNewEmployee() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter new Id");
		int eid = sc.nextInt();
		String ename = sc.next();
		System.out.println("Enter a Hiredate");
		String dt = sc.next();
		LocalDate ldt = LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("Enter Salary");
		double s = sc.nextDouble();
		System.out.println("Enter a Project id");
		String pid = sc.next();
		String[] parr=pid.split(",");
		Set<Project> pset=pdao.findByPid(parr);
		Employee e = new Employee (eid,ename,ldt,s,pset);		
		return edao.save(e);
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return edao.findAllEmployee();
	}

	@Override
	public boolean deleteById(int empid) {
		return edao.removeById(empid);
	}

	@Override
	public boolean updateEmployeeById(int empid, String ename, double sal) {
		return edao.modifyEmployeeById(empid,ename,sal);
	}

	@Override
	public boolean addProjectToEmployee(int eid, int pid) {
		Employee e =edao.findById(eid);
		Project p = pdao.findById(pid);
		if(e!=null && p!=null) {
			return edao.addextraProjectToEmployee(e,p);
		}
		return false;
	}

	@Override
	public List<Employee> SortEmployeeBySalary() {
		
		return edao.sortBySalary();
	}

	@Override
	public void closeMySessionFactory() {
		 edao.closeMySessionFactory();
	}
	

}
