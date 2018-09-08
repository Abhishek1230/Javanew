package com.test.business;

import java.util.List;
import com.test.beans.Product;

public class DeleteProduct 
{
	public void deleteProduct(String productID,List<Product> product)
	{
		for(int i=0;i<product.size();i++)
		{
			Product p = product.get(i);
			if(p.getProductID().equalsIgnoreCase(productID))
			{
				product.remove(i);
				break;
			}
		}
	}
}
