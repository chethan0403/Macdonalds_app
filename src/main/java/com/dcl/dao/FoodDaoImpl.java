package com.dcl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.dcl.dto.Food;
import com.dcl.utility.ConnectionFactory;


public class FoodDaoImpl implements FoodDao {

	@Override
	public boolean saveFood(Food f) {

		boolean flag = false;

		try {
			Connection con = ConnectionFactory.getconnection();

			String query = "insert into food(fname,category,price) values(?,?,?)";

			PreparedStatement ps = con.prepareStatement(query);

			ps.setString(1, f.getFname());
			ps.setString(2, f.getCategory());
			ps.setDouble(3, f.getPrice());

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
	public boolean deleteFood(Integer fid) {

		boolean flag = false;

		try {
			Connection con = ConnectionFactory.getconnection();

			String query = "delete from food where fid=?";

			PreparedStatement ps = con.prepareStatement(query);

			ps.setInt(1, fid);

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
	public boolean updateFood(Food f) {

		boolean flag = false;

		try {
			Connection con = ConnectionFactory.getconnection();

			String query = "update food set fname=?,category=?,price=? where fid=?";

			PreparedStatement ps = con.prepareStatement(query);

			ps.setString(1, f.getFname());
			ps.setString(2, f.getCategory());
			ps.setDouble(3, f.getPrice());
			ps.setInt(4, f.getFid());

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
	public List<Food> fetchCategory(Integer fid, String category) {

		List<Food> list = new ArrayList<>();

		try {
			Connection con = ConnectionFactory.getconnection();

			String query = "select * from food where category=?";

			PreparedStatement ps = con.prepareStatement(query);

			ps.setString(1, category);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				Food f = new Food();

				f.setFid(rs.getInt("fid"));
				f.setFname(rs.getString("fname"));
				f.setCategory(rs.getString("category"));
				f.setPrice(rs.getDouble("price"));

				list.add(f);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public List<Food> fetchFood(String fname) {

		List<Food> list = new ArrayList<>();

		try {
			Connection con = ConnectionFactory.getconnection();

			String query = "select * from food where fname=?";

			PreparedStatement ps = con.prepareStatement(query);

			ps.setString(1, fname);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				Food f = new Food();

				f.setFid(rs.getInt("fid"));
				f.setFname(rs.getString("fname"));
				f.setCategory(rs.getString("category"));
				f.setPrice(rs.getDouble("price"));

				list.add(f);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public List<Food> fetchAllFood() {

		List<Food> list = new ArrayList<>();

		try {
			Connection con = ConnectionFactory.getconnection();

			String query = "select * from food";

			PreparedStatement ps = con.prepareStatement(query);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				Food f = new Food();

				f.setFid(rs.getInt("fid"));
				f.setFname(rs.getString("fname"));
				f.setCategory(rs.getString("category"));
				f.setPrice(rs.getDouble("price"));

				list.add(f);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

}