package com.demo.beans;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="emp102")
public class Employee {
	@Id
	private int eid;
	private String ename;
	private LocalDate hiredate;
	private double sal;
	
	@ManyToMany
	Set<Project> pset;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String ename, LocalDate hiredate, double sal, Set<Project> pset) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.hiredate = hiredate;
		this.sal = sal;
		this.pset = pset;
	}

	public Employee(int eid, String ename, LocalDate date, double sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.hiredate = hiredate;
		this.sal = sal;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public LocalDate getDate() {
		return hiredate;
	}

	public void setDate(LocalDate date) {
		this.hiredate = date;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public Set<Project> getPset() {
		return pset;
	}

	public void setPset(Set<Project> pset) {
		this.pset = pset;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", hiredate=" + hiredate + ", sal=" + sal + "]";
	}
	
	
	
}
