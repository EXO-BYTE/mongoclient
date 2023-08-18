package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.model.Product;
@Component
public class productDAOSQLImpl implements ProductDAO {

	
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		System.out.println(product+" added successfully to rdbms");
	}
	
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return new ArrayList();
	}
	
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		System.out.println(product+" has been updated successfully");
	}
	
	public void deleteProduct(Product product) {
		// TODO Auto-generated method stub
		System.out.println(product+" deleted seccessfully");
	}

	public Product getProduct(String productName) {
		// TODO Auto-generated method stub
		return new Product();
	}
	
}
