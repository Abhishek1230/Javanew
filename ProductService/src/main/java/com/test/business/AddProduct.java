package com.test.business;

import com.test.beans.Product;

public class AddProduct 
{
	public Product addProduct(String productID, String productName, String productDesc, double price, int qty)
	{
		Product p = new Product(productID, productName,productDesc, price, qty);
		return p;
	}
}
