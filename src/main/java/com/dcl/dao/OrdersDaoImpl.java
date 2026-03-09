package com.dcl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.dcl.dto.Orders;
import com.dcl.utility.ConnectionFactory;


public class OrdersDaoImpl implements OrdersDao {

	@Override
	public boolean saveOrder(Orders o) {

		boolean flag = false;

		try {

			Connection con = ConnectionFactory.getconnection();

			String query = "insert into orders(cid,odate,tamount,status) values(?,?,?,?)";

			PreparedStatement ps = con.prepareStatement(query);

			ps.setInt(1, o.getCid());
			ps.setString(2, o.getOdate());
			ps.setDouble(3, o.getTamount());
			ps.setString(4, o.getStatus());

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
	public boolean deleteOrder(Integer oid) {

		boolean flag = false;

		try {

			Connection con = ConnectionFactory.getconnection();

			String query = "delete from orders where oid=?";

			PreparedStatement ps = con.prepareStatement(query);

			ps.setInt(1, oid);

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
	public boolean updateOrder(Orders o) {

		boolean flag = false;

		try {

			Connection con = ConnectionFactory.getconnection();

			String query = "update orders set cid=?,odate=?,tamount=?,status=? where oid=?";

			PreparedStatement ps = con.prepareStatement(query);

			ps.setInt(1, o.getCid());
			ps.setString(2, o.getOdate());
			ps.setDouble(3, o.getTamount());
			ps.setString(4, o.getStatus());
			ps.setInt(5, o.getOid());

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
	public List<Orders> fetchByCustomerId(Integer cid) {

		List<Orders> list = new ArrayList<>();

		try {

			Connection con = ConnectionFactory.getconnection();

			String query = "select * from orders where cid=?";

			PreparedStatement ps = con.prepareStatement(query);

			ps.setInt(1, cid);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				Orders o = new Orders();

				o.setOid(rs.getInt("oid"));
				o.setCid(rs.getInt("cid"));
				o.setOdate(rs.getString("odate"));
				o.setTamount(rs.getDouble("tamount"));
				o.setStatus(rs.getString("status"));

				list.add(o);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public List<Orders> allOrders() {

		List<Orders> list = new ArrayList<>();

		try {

			Connection con = ConnectionFactory.getconnection();

			String query = "select * from orders";

			PreparedStatement ps = con.prepareStatement(query);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				Orders o = new Orders();

				o.setOid(rs.getInt("oid"));
				o.setCid(rs.getInt("cid"));
				o.setOdate(rs.getString("odate"));
				o.setTamount(rs.getDouble("tamount"));
				o.setStatus(rs.getString("status"));

				list.add(o);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

}