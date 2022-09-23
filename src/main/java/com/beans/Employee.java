package com.beans;

public class Employee {
	private int empid;
	private String empname;
	private String date_time;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getDate_time() {
		return date_time;
	}
	public void setDate_time(String date_time) {
		this.date_time = date_time;
	}
	public Employee(int empid, String empname, String date_time) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.date_time = date_time;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", date_time=" + date_time + "]";
	}
	
	

}
