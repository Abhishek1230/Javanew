package com.test.controller;

import java.io.IOException;
import java.util.*;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.beans.Product;
import com.test.business.AddProduct;

/**
 * Servlet implementation class ProductController
 */
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	List<Product> products = new ArrayList<Product>();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String command  = request.getParameter("command");
		int cmd = Integer.parseInt(command);
		
		switch(cmd)
		{
		case 1:
			 String productID=request.getParameter("prodid"); 
		     String productName=request.getParameter("prodname");
			 String productDesc=request.getParameter("proddesc");
			 String price=request.getParameter("prodprice");
			 String quantity=request.getParameter("prodqty");
			 double pr =Double.parseDouble(price);
			 int qty=Integer.parseInt(quantity);
			 AddProduct ap = new AddProduct();
			 Product p = ap.addProduct(productID,productName,productDesc,pr,qty);
			 products.add(p);
			 request.setAttribute("products",products);
			 request.getRequestDispatcher("/display.jsp").forward(request, response);
			 break;
			
		case 2:
			
			break;
			
			default:
				break;
		}
	}

}
