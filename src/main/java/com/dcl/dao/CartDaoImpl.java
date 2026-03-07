package com.dcl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.dcl.dto.Cart;

import com.dcl.utility.ConnectionFactory;

public class CartDaoImpl implements CartDao {

    @Override
    public boolean saveCart(Cart c) {
        boolean status = false;

        try {
            Connection con = ConnectionFactory.getconnection();

            String sql = "insert into cart(fid, qty, price) values(?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, c.getFid());
            ps.setInt(2, c.getQty());
            ps.setDouble(3, c.getPrice());

            int rows = ps.executeUpdate();

            if (rows > 0) {
                status = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }

    @Override
    public boolean deleteCart(Integer cartid) {

        boolean status = false;

        try {
            Connection con =ConnectionFactory.getconnection();

            String sql = "delete from cart where cart_id=?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cartid);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                status = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }

    @Override
    public List<Cart> fetchByCartId(Integer oid) {

        List<Cart> list = new ArrayList<>();

        try {
            Connection con = ConnectionFactory.getconnection();

            String sql = "select * from cart where cartid=?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, oid);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Cart c = new Cart();

                c.setCartid(rs.getInt("cart_id"));
                c.setCname(rs.getString("food"));
                c.setQuantity(rs.getInt("quantity"));
                c.setPrice(rs.getDouble("price"));

                list.add(c);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

}