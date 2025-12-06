package com.demo.beans;
import java.util.Date;
public class ContractEmp extends Employee {
	private float hrs;
	private double charges;
	public ContractEmp() {
		super();
	}
	public ContractEmp(float hrs, double charges,String pname, Date bdate, String desg, String dept ) {
		super("c", pname, bdate, desg,dept);
		
		this.hrs = hrs;
		this.charges = charges;
		
	}
	public float getHrs() {
		return hrs;
	}
	public void setHrs(float hrs) {
		this.hrs= hrs;
	}
	public double getCharges() {
		return charges;
	}
	public void setCharges(double charges) {
		this.charges = charges;
	}
	
	@Override
	public double calculateSal() {
		// TODO Auto-generated method stub
		return hrs*charges;
	}
	@Override
	public String toString() {
		return super.toString() +" ContractEmp [ hrs = "+hrs +" Charges=  "+charges+ " ]"; 
	}
	
}
