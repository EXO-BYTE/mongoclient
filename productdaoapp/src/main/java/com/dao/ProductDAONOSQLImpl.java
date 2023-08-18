package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.model.Product;

public class ProductDAONOSQLImpl implements ProductDAO{

	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		System.out.println(product+" added successfully to no sql");
	}

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return new ArrayList();

	}

	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		System.out.println(product+" has been updated successfully to no sql");
	}

	public void deleteProduct(Product product) {
		// TODO Auto-generated method stub
		System.out.println(product+" deleted seccessfully from no sql");
	}

	public Product getProduct(String productName) {
		// TODO Auto-generated method stub
		return new Product();
	}

}
