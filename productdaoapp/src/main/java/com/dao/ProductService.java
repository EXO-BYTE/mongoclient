package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.model.Product;

@Service
public class ProductService {
	
	@Autowired
	
	ProductDAO productDAONOSQLImpl;
	
	public void add(Product product) {
		productDAONOSQLImpl.addProduct(product);
	}
	public List getAll() {
		return productDAONOSQLImpl.getAllProducts();
	}
}
