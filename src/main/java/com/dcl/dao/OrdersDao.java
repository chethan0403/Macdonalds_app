package com.dcl.dao;

import java.util.List;

import com.dcl.dto.Orders;

public interface OrdersDao {
	public boolean saveOrder(Orders o);
	public boolean deleteOrder(Integer oid);
	public boolean updateOrder(Orders o);
	
	public List<Orders> fetchByCustomerId(Integer cid);
	public List<Orders> allOrders();
}
