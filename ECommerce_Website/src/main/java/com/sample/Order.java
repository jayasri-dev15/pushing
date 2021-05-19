package com.sample;

import java.util.ArrayList;
import java.util.List;

/* I define the following business rules for a ecommerce or brick-and-mortar store to decide when and what promotional discount(s) should  be applied for an order. They are fictitious rules that should be commonly understandable.

Large order discount
5% discount for order total over $1000 and less than $2000
10% discount for order total over $2000

Clearance products – 10% off from a list of defined products

Time based sales – 10% off from a list of defined products within a certain date range, e.g. Christmas sales between 1/12 to 31/12.

Special Tuesday – everything 5% off on Tuesday */

public class Order 

{
	private double orderDiscountAmount; // order discount amount

	private List<OrderLine> lines = new ArrayList<OrderLine>();

	// calculate discounted total amount of all the items in this order
	public double getLineTotal() {
	double lineTotal = 0;
	for (OrderLine line : lines) 
	
	{
	lineTotal += line.getLineAmount();
	}
	
	return lineTotal;
	}

	public double getOrderDiscountAmount() {
		return orderDiscountAmount;
	}

	public List<OrderLine> getLines() {
		return lines;
	}

	public void setOrderDiscountAmount(double orderDiscountAmount) {
		this.orderDiscountAmount = orderDiscountAmount;
	}

	public void setLines(List<OrderLine> lines) {
		this.lines = lines;
	}
	
	
}
