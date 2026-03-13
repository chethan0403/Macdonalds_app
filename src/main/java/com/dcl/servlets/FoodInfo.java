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

@WebServlet("/addFood")
public  class FoodInfo extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		CustomerDao cdao=new CustomerDaoImpl();
		
		Customer c=cdao.fetchByMailAndPassword(null, null);
		
		
		
		
		
	}

    
}