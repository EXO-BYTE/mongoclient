package com.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.mybean.Product;

@Configuration
public class AppConfig {
	@Bean(name="coffee")
	public Product getproduct() {
		Product product=new Product("Coffee",23,100);
		return product;
	}
}
