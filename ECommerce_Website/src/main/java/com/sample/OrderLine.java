package com.sample;

public class OrderLine 

{

		private String sku;
		private int qty; // quantity bought
		private double unitPrice; // price for each unit
		private double lineDiscountAmount; // discount applied to this item

		public double getLineAmount() 
		
		{
		return ((unitPrice * qty) - (lineDiscountAmount));
		}

		public String getSku() {
			return sku;
		}

		public int getQty() {
			return qty;
		}

		public double getUnitPrice() {
			return unitPrice;
		}

		public double getLineDiscountAmount() {
			return lineDiscountAmount;
		}

		public void setSku(String sku) {
			this.sku = sku;
		}

		public void setQty(int qty) {
			this.qty = qty;
		}

		public void setUnitPrice(double unitPrice) {
			this.unitPrice = unitPrice;
		}

		public void setLineDiscountAmount(double lineDiscountAmount) {
			this.lineDiscountAmount = lineDiscountAmount;
		}

		public OrderLine(String sku, int qty, double unitPrice) {
			super();
			this.sku = sku;
			this.qty = qty;
			this.unitPrice = unitPrice;
		}


		
		
	
}
