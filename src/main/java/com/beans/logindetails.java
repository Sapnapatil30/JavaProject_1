package com.beans;

public class logindetails {

	private int empid;
	private String empname;
	private String content;
	private String email;
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public logindetails(int empid, String empname, String content, String email) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.content = content;
		this.email = email;
	}
	public logindetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "logindetails [empid=" + empid + ", empname=" + empname + ", content=" + content + ", email=" + email
				+ "]";
	}
	
	
	
}
