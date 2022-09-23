package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.Employee;
import com.dao.EmployeeDAO;

/**
 * Servlet implementation class view
 */
@WebServlet("/view")
public class view extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
EmployeeDAO d3=new EmployeeDAO();
        

		PrintWriter p=response.getWriter();
		List<Employee> users=new ArrayList<>();
		
		users.addAll(d3.getlogindetails());
		
		p.println("<table callspacing='0' width='35px' border='1px'>");
		p.println("<tr>");
		p.println("<th>Employee Id</th>");
		p.println("<th>Employee Name</th>");
		p.println("<th>Data And Time</th>");
		p.println("</tr>");
		
		for(Employee u:users)
		{
			p.println("<tr>");
			p.println("<td>"+u.getEmpid()+"</td>");
			p.println("<td>"+u.getEmpname()+"</td>");
			p.println("<td>"+u.getDate_time()+"</td>");
			p.println("</tr>");
		}
		p.println("</table>");
		
	}
	

}
