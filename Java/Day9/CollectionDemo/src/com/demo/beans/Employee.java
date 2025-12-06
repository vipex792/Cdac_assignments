package com.demo.beans;
import java.time.LocalDate;

public class Employee implements Comparable <Employee> {
	
	private int empid;
	private String ename;
	private double sal;
	LocalDate jdt;
	
	public Employee() {
		super();
	}
	
	public Employee(int empid) {
		super();
		this.empid=empid;
	}
	public Employee(int empid, String ename, double sal, LocalDate jdt) {
		
		this.empid = empid;
		this.ename = ename;
		this.sal = sal;
		this.jdt = jdt;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("in equals method " + this.empid + "---"+ ((Employee)obj).empid);
		return this.empid ==((Employee)obj).empid;
	}
	
	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid =empid;
		
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename=ename;
	}
	public double getSal() {
		return sal;
		
	}
	public void setSal(double sal) {
		this.sal=sal;
	}
	public LocalDate getJdt(){
		return jdt;
		
	}
	public void setJdt(LocalDate jdt) {
		this.jdt = jdt;
	}
	
	@Override
	public String toString() {
		return "Employee [empid = "+empid + ", Ename : "+ ename +", Salary : " +sal + ", Jdt = " +jdt+ " ]";
	}
	
	@Override
	public int compareTo(Employee ob) {
		System.out.println("in compareTo method "+ this.empid + "----"  + ob.empid);
		System.out.println("Salary-->" + this.sal + "---" + ob.sal);
		
		return (int)(this.sal-ob.sal);
	}
	
	


}
