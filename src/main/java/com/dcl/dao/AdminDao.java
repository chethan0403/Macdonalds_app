package com.dcl.dao;

import java.util.List;

import com.dcl.dto.Admin;
import com.dcl.dto.Customer;

public interface AdminDao {
	public boolean saveAdmin(Admin a);
	public List<Customer> getAllCustomer();
}
