package com.dcl.servlets;

import java.io.IOException;

import com.dcl.dao.AdminDao;
import com.dcl.dao.AdminDaoImpl;
import com.dcl.dto.Admin;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/adminRegister")
public class Admininfo extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		AdminDao Adao=new  AdminDaoImpl();
		
		
		
		
		String aname=req.getParameter("aname");
		String apassword=req.getParameter("apassword");
		
		Admin a=new Admin();
		a.setAname(aname);
		a.setPassword(apassword);
		
		boolean ad=Adao.saveAdmin(a);
		
		if(ad) {
			req.setAttribute("message","Admin registered successfully!");
		}
		else{
			req.setAttribute("message", "Registration failed. Try again!");
		}
		
		req.getRequestDispatcher("Admin.jsp").forward(req, resp);
		
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
	}

}
