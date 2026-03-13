package com.dcl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dcl.dto.Admin;
import com.dcl.dto.Customer;
import com.dcl.utility.ConnectionFactory;

public class AdminDaoImpl implements AdminDao {

    private Connection con;
    public AdminDaoImpl() {
        this.con = ConnectionFactory.getconnection();
    }

    @Override
    public boolean saveAdmin(Admin a) {

        String query = "insert into admin values(0,?,?)";
        int i = 0;

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, a.getAname());
            ps.setString(2, a.getPassword());
            i = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (i > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<Customer> getAllCustomer() {

        ArrayList<Customer> list = new ArrayList<Customer>();
        String query = "select * from Customer";
        Customer c = null;
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                c = new Customer();
                c.setCid(rs.getInt("cid"));
                c.setCname(rs.getString("cname"));
                c.setCmail(rs.getString("cmail"));
                c.setCphone(rs.getLong("cphone"));
                list.add(c);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

}