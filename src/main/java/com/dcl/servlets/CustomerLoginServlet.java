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
import jakarta.servlet.http.HttpSession;

@WebServlet("/customerLogin")
public class CustomerLoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {

		String cmail = req.getParameter("cmail");
		String cpassword = req.getParameter("cpassword");

		CustomerDao cd = new CustomerDaoImpl();

		Customer c = cd.fetchByMailAndPassword(cmail, cpassword);

		if(c != null) {

			HttpSession session = req.getSession();

			session.setAttribute("customer", c);

			resp.sendRedirect("food.jsp");
			
			System.out.println("data is present u r login successful");

		}
		else {

			resp.sendRedirect("customerLogin.jsp");
			System.out.println("data is present u r not login successful");

		}
	}
}