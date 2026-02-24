package com.dcl.dao;

import com.dcl.dto.Customer;

public interface CustomerDao {
	
	public boolean saveCustomer(Customer c);
	public boolean updateCustomer(Customer c);
	public boolean deleteCustomer(Integer cid);
	
}
