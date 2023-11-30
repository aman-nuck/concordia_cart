package com.shashi.service;

import java.util.Map;

public interface  DiscountService 
{
	public double suggestDiscountBasedOnSalesPerformance(String prodId);
	public double suggestDiscountBasedOnCart(String username);
	public double suggestDiscountBasedOnSpending(String username);
	public Map<String, Integer> getProductSalesData();
}
