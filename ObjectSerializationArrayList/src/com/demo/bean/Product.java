package com.demo.bean;

import java.io.Serializable;

public class Product implements Serializable{
	private int pid;
	private String pname;
	private double price;
	private int qty;
	public Product() {
		//super();
		int pid=0;
		String pname=null;
		double price=0.0;
		int qty=0;
	}
	public Product(int pid, String pname, double price, int qty) {
		//super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.qty = qty;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if(this.pid==((Product)obj).pid) {
			return true;
		}
		return false;
		
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", qty=" + qty + "]";
	}
	

}
