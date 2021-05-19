package com.sample;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TimeBasedSales 


{
	private Date fromDate;
	private Date toDate;
	private List<String> products = new ArrayList<String>();
	
	public Date getFromDate() {
		return fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public List<String> getProducts() {
		return products;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	public void setProducts(List<String> products) {
		this.products = products;
	}
	
	
	
}
