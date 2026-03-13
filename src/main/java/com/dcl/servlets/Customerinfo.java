package com.dcl.servlets;

import java.io.IOException;

import com.dcl.dao.CustomerDao;
import com.dcl.dao.CustomerDaoImpl;
import com.dcl.dto.Customer;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/customerRegister")
public class Customerinfo extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String cname=req.getParameter("cname");
		String cemail=req.getParameter("cmail");
		Long cphone=Long.parseLong(req.getParameter("cphone"));
		String cpassword=req.getParameter("cpassword");
		
		Customer c=new Customer();
		c.setCname(cname);
		c.setCmail(cemail);
		c.setCphone(cphone);
		c.setCpassword(cpassword);
		
		CustomerDao Cdao=new  CustomerDaoImpl();
		
		boolean sc=Cdao.saveCustomer(c);
		
		if(sc) {
			req.setAttribute("message","Customer Regiseter successfully!");
		}
		else {
			req.setAttribute("message", "login failed. Try again....");
		}
		
		req.getRequestDispatcher("login.jsp").forward(req, resp);
	}

}
