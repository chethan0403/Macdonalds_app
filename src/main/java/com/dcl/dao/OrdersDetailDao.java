package com.dcl.dao;

import java.util.List;

import com.dcl.dto.OrderDetail;

public interface OrdersDetailDao {
	public boolean saveOrderDetails(OrderDetail od);
	public boolean deleteOrderDetails(Integer orderdetailid);
	
	public List<OrderDetail> fetchByOrderId(Integer oid);
}
