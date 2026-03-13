package com.dcl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dcl.dto.Customer;
import com.dcl.utility.ConnectionFactory;


public class CustomerDaoImpl implements CustomerDao {

	@Override
	public boolean saveCustomer(Customer c) {

		boolean flag = false;

		try {

			Connection con = ConnectionFactory.getconnection();

			String query = "insert into customer(cname,cmail,cphone,cpassword) values(?,?,?,?)";

			PreparedStatement ps = con.prepareStatement(query);

			ps.setString(1, c.getCname());
			ps.setString(2, c.getCmail());
			ps.setLong(3, c.getCphone());
			ps.setString(4, c.getCpassword());

			int i = ps.executeUpdate();

			if (i > 0) {
				flag = true;
				System.out.println("data get inserted");
			}else {
				System.out.println("data not stored");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return flag;
	}

	@Override
	public boolean updateCustomer(Customer c) {

		boolean flag = false;

		try {

			Connection con = ConnectionFactory.getconnection();

			String query = "update customer set cname=?,cmail=?,cphone=?,cpassword=? where cid=?";

			PreparedStatement ps = con.prepareStatement(query);

			ps.setString(1, c.getCname());
			ps.setString(2, c.getCmail());
			ps.setLong(3, c.getCphone());
			ps.setString(4, c.getCpassword());
			ps.setInt(5, c.getCid());

			int i = ps.executeUpdate();

			if (i > 0) {
				flag = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return flag;
	}

	@Override
	public boolean deleteCustomer(Integer cid) {

		boolean flag = false;

		try {

			Connection con = ConnectionFactory.getconnection();

			String query = "delete from customer where cid=?";

			PreparedStatement ps = con.prepareStatement(query);

			ps.setInt(1, cid);

			int i = ps.executeUpdate();

			if (i > 0) {
				flag = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return flag;
	}


	@Override
	public Customer fetchByMailAndPassword(String cmail,String cpassword) {
		
		Connection con=ConnectionFactory.getconnection();
		
		String query="select * from customer where cmail=? and cpassword=?";
		Customer c=null;
		
		try {
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setString(1,cmail);
			ps.setString(2,cpassword);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				c=new Customer();
				c.setCid(rs.getInt("cid"));
				c.setCname(rs.getString("cname"));
				c.setCmail(rs.getString("cmail"));
				c.setCpassword(rs.getString("cpassword"));
				c.setCphone(rs.getLong("cphone"));
			}
			if(c!=null) {
				System.out.println("data is present");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return c;
	}

}

