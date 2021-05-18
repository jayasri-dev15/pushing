package com.sample;

import java.math.BigDecimal;

// The person who purchased more than $15 is provided with the discount of 10%
//The person who purchased more than $25 is provided with the discount of 15%
//The person who purchased 2 or more Tacos and cool drink is true then additional 5%discount



public class Cart 

{
private BigDecimal totalPurchased;

private int discount;

private boolean IsPurchasedCooldrink;

private int tacoCount;

public Cart(BigDecimal totalPurchased, boolean isPurchasedCooldrink, int tacoCount) {
	super();
	this.totalPurchased = totalPurchased;
	this.discount = 0;
	IsPurchasedCooldrink = isPurchasedCooldrink;
	this.tacoCount = tacoCount;
}

public BigDecimal getTotalPurchased() {
	return totalPurchased;
}

public void setTotalPurchased(BigDecimal totalPurchased) {
	this.totalPurchased = totalPurchased;
}

public int getDiscount() {
	return discount;
}

public void setDiscount(int discount) {
	this.discount = discount;
}

public boolean isIsPurchasedCooldrink() {
	return IsPurchasedCooldrink;
}

public void setIsPurchasedCooldrink(boolean isPurchasedCooldrink) {
	IsPurchasedCooldrink = isPurchasedCooldrink;
}

public int getTacoCount() {
	return tacoCount;
}

public void setTacoCount(int tacoCount) {
	this.tacoCount = tacoCount;
}



}
