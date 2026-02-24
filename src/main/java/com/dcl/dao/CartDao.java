package com.dcl.dao;

import java.util.List;

import com.dcl.dto.Cart;
public interface CartDao {
	public boolean saveCart(Cart c);
	public boolean deleteCart(Integer cartid);
	
	public List<Cart> fetchByCartId(Integer oid);
}
