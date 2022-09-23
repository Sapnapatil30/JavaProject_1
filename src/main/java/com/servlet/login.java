package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.Employee;
import com.beans.logindetails;
import com.dao.EmployeeDAO;


/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime now=LocalDateTime.now();
		
		int empId=Integer.parseInt(request.getParameter("empid"));
		String empName=request.getParameter("empname");
		String date_time=dtf.format(now);
		
		Employee e1=new Employee();
		e1.setEmpid(empId);
		e1.setEmpname(empName);
		e1.setDate_time(date_time);
		
		EmployeeDAO d2=new EmployeeDAO();
		PrintWriter out=response.getWriter();
		List<logindetails> user=new ArrayList<>();
		user=d2.getUser();
		for(logindetails u:user)
		{
			if(u.getEmpid()==empId ) //&& u.getEmpName()==empName
			{
				d2.logininsert(e1);
				RequestDispatcher req=request.getRequestDispatcher("Main.jsp");
				req.forward(request, response);
				
			}

			
		}
		
		RequestDispatcher req=request.getRequestDispatcher("index.jsp");
		req.forward(request, response);
		
		
	}
	

}
