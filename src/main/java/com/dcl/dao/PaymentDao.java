package com.dcl.dao;

import java.util.List;

import com.dcl.dto.Payment;
public interface PaymentDao {
	public interface PaymentDAO {
		
		public boolean insertPayment(Payment p);
		public boolean updatePayment(Payment p);
		public boolean deletePayment(Integer pid);
		
		public Payment getPayment(Integer pid);
		public List<Payment> getAllPaymentDetails();
		public List<Payment> getPaymentDetailsByOrderId(Integer oid);
	}
}
