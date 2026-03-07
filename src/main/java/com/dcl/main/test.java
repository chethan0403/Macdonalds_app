package com.dcl.main;

import com.dcl.dao.AdminDao;
import com.dcl.dao.AdminDaoImpl;
import com.dcl.dto.Admin;

public class test {

	public static void main(String[] args) {
		AdminDao a=new AdminDaoImpl();
		Admin a1=new Admin();
		a1.setAname("chethan");
		a1.setPassword("2003");
		
		boolean status=a.saveAdmin(a1);
		if(status) {
			System.out.println("data saved successfully");
		}
		else {
			System.out.println("data not saved");
		}

	}

}
