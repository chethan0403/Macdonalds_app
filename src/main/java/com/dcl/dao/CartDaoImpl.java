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

        boolean flag = false;

        try {

            Connection con = ConnectionFactory.getconnection();

            String query = "insert into cart(oid,fid,fname,price,qty) values(?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, c.getOid());
            ps.setInt(2, c.getFid());
            ps.setString(3, c.getFname());
            ps.setInt(4, c.getPrice());
            ps.setInt(5, c.getQty());

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
    public boolean deleteCart(Integer cartid) {

        boolean flag = false;

        try {

            Connection con =ConnectionFactory.getconnection();

            String query = "delete from cart where cartid=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, cartid);

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
    public List<Cart> fetchByCartId(Integer oid) {

        List<Cart> list = new ArrayList<>();

        try {

            Connection con = ConnectionFactory.getconnection();

            String query = "select * from cart where oid=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, oid);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Cart c = new Cart();

                c.setCartid(rs.getInt("cartid"));
                c.setOid(rs.getInt("oid"));
                c.setFid(rs.getInt("fid"));
                c.setFname(rs.getString("fname"));
                c.setPrice(rs.getInt("price"));
                c.setQty(rs.getInt("qty"));

                list.add(c);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}