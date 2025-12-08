package com.demo.beans;
import java.util.Date;
abstract public class Employee extends Person {
	private String dept;
	private String desg;
	
	public Employee() {
		super();
		System.err.println("The default constructor is called");
	}
	public Employee (String emptype, String pname, Date bdate, String dept, String desg) {
		super(pname, emptype,bdate);
		System.out.println("in Employee  parametrized constructor ");
	this.dept = dept;
	this.desg = desg;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public String getDesg() {
		return desg;
	}
	
	abstract public double calculateSal();
	
	@Override
	public String toString() {
		return super.toString() + "Employee [ dept = "+dept + " desg =  " + desg + " ] ";
	}
	
	
	
	
	
}
