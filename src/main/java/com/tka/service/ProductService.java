package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tka.dao.ProductDao;
import com.tka.entity.Product;

@Service
public class ProductService {
	
	@Autowired
	private ProductDao productDao;

	public String addProduct(Product product) {
		return productDao.addProduct(product);

	}

	public List<Product> getAllProducts() {
		return productDao.getAllProducts();
	}
}
