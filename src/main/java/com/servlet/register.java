package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.logindetails;
import com.dao.EmployeeDAO;

/**
 * Servlet implementation class register
 */
@WebServlet("/register")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		int empId=Integer.parseInt(request.getParameter("empid"));
		String empName=request.getParameter("empname");
		String contact=request.getParameter("contact");
		String email=request.getParameter("email");

		
		logindetails r1=new logindetails();
		r1.setEmpid(empId);
		r1.setEmpname(empName);
		r1.setEmail(email);
		r1.setContent(contact);
		
		EmployeeDAO d1=new EmployeeDAO();
		boolean b=d1.insertdata(r1);
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		if(b)
		{
			
			RequestDispatcher req=request.getRequestDispatcher("index.jsp");
			req.forward(request, response);
			
		}
		else
		{
			out.println("Invalid user details. Re-enter details!!!");
			RequestDispatcher req=request.getRequestDispatcher("register.jsp");
			req.include(request, response);
			
		}
		
	
	}
	

}
