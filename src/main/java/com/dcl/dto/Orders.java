package com.dcl.dto;

public class Orders {
	private Integer oid;
	private Integer cid;
	private String odate;
	private Double tamount;
	private String status;
	public Integer getOid() {
		return oid;
	}
	public void setOid(Integer oid) {
		this.oid = oid;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getOdate() {
		return odate;
	}
	public void setOdate(String odate) {
		this.odate = odate;
	}
	public Double getTamount() {
		return tamount;
	}
	public void setTamount(Double tamount) {
		this.tamount = tamount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}