package com.dcl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.dcl.dao.PaymentDao.PaymentDAO;
import com.dcl.dto.Payment;
import com.dcl.utility.ConnectionFactory;


public class PaymentDaoImpl implements PaymentDAO {

	@Override
	public boolean insertPayment(Payment p) {

		boolean flag = false;

		try {

			Connection con = ConnectionFactory.getconnection();

			String query = "insert into payment(oid,paymentmethod,status,amount,paymentDate) values(?,?,?,?,?)";

			PreparedStatement ps = con.prepareStatement(query);

			ps.setInt(1, p.getOid());
			ps.setString(2, p.getPaymentmethod());
			ps.setString(3, p.getStatus());
			ps.setDouble(4, p.getAmount());
			ps.setString(5, p.getPaymentDate());

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
	public boolean updatePayment(Payment p) {

		boolean flag = false;

		try {

			Connection con = ConnectionFactory.getconnection();

			String query = "update payment set oid=?,paymentmethod=?,status=?,amount=?,paymentDate=? where pid=?";

			PreparedStatement ps = con.prepareStatement(query);

			ps.setInt(1, p.getOid());
			ps.setString(2, p.getPaymentmethod());
			ps.setString(3, p.getStatus());
			ps.setDouble(4, p.getAmount());
			ps.setString(5, p.getPaymentDate());
			ps.setInt(6, p.getPid());

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
	public boolean deletePayment(Integer pid) {

		boolean flag = false;

		try {

			Connection con = ConnectionFactory.getconnection();

			String query = "delete from payment where pid=?";

			PreparedStatement ps = con.prepareStatement(query);

			ps.setInt(1, pid);

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
	public Payment getPayment(Integer pid) {

		Payment p = null;

		try {

			Connection con = ConnectionFactory.getconnection();

			String query = "select * from payment where pid=?";

			PreparedStatement ps = con.prepareStatement(query);

			ps.setInt(1, pid);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				p = new Payment();

				p.setPid(rs.getInt("pid"));
				p.setOid(rs.getInt("oid"));
				p.setPaymentmethod(rs.getString("paymentmethod"));
				p.setStatus(rs.getString("status"));
				p.setAmount(rs.getDouble("amount"));
				p.setPaymentDate(rs.getString("paymentDate"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return p;
	}

	@Override
	public List<Payment> getAllPaymentDetails() {

		List<Payment> list = new ArrayList<>();

		try {

			Connection con = ConnectionFactory.getconnection();

			String query = "select * from payment";

			PreparedStatement ps = con.prepareStatement(query);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				Payment p = new Payment();

				p.setPid(rs.getInt("pid"));
				p.setOid(rs.getInt("oid"));
				p.setPaymentmethod(rs.getString("paymentmethod"));
				p.setStatus(rs.getString("status"));
				p.setAmount(rs.getDouble("amount"));
				p.setPaymentDate(rs.getString("paymentDate"));

				list.add(p);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public List<Payment> getPaymentDetailsByOrderId(Integer oid) {

		List<Payment> list = new ArrayList<>();

		try {

			Connection con = ConnectionFactory.getconnection();

			String query = "select * from payment where oid=?";

			PreparedStatement ps = con.prepareStatement(query);

			ps.setInt(1, oid);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				Payment p = new Payment();

				p.setPid(rs.getInt("pid"));
				p.setOid(rs.getInt("oid"));
				p.setPaymentmethod(rs.getString("paymentmethod"));
				p.setStatus(rs.getString("status"));
				p.setAmount(rs.getDouble("amount"));
				p.setPaymentDate(rs.getString("paymentDate"));

				list.add(p);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

}