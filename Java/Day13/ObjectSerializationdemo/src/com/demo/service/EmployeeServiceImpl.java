package com.demo.service;
import java.util.Scanner;
import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;
public class EmployeeServiceImpl implements EmployeeService {
private EmployeeDao edao;

public EmployeeServiceImpl() {
	super();
	this.edao = new EmployeeDaoImpl();
}
@Override
public void readFile(String fname) {
	edao.readData(fname);
}
	public boolean addNewEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Empid: ");
		int empid = sc.nextInt();
		System.out.println("Enter Emname: ");
		String nm = sc.next();
		System.out.println("Enter Desg: ");
		String desg = sc.next();
		System.out.println("Enter Sal");
		double sal = sc.nextDouble();
		Employee e = new  Employee(empid,nm,desg,sal);
		return  edao.save(e);

	}
	public boolean deleteById(int empid) {
		return edao.removeById(empid);
	}

}
