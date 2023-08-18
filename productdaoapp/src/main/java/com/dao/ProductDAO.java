package com.dao;
import java.util.List;

import com.model.Product;
public interface ProductDAO {
	void addProduct(Product product);
	List<Product> getAllProducts();
	void updateProduct(Product product);
	void deleteProduct(Product product);
	Product getProduct(String productName);
	
}
