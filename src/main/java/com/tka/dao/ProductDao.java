package com.tka.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Product;

@Repository
public class ProductDao {

	@Autowired
	SessionFactory sessionFactory;

//   1.Post Add Product
	public String addProduct(Product product) {
		Session session = sessionFactory.openSession();

		// Start a transaction (hibernate best practice: begin transaction before
		// performing operations)
		session.beginTransaction();

		// Check if a product with the same ID already exists
		Product existingProduct = session.get(Product.class, product.getProductId());

		// If the product exists, return a message
		if (existingProduct != null) {
			session.getTransaction().commit(); // Commit transaction
			session.close(); // Close the session
			return "Product with ID " + product.getProductId() + " already exists.";
		}

		// If no existing product, save the new product
		session.save(product);

		// Commit the transaction and close the session
		session.getTransaction().commit();
		session.close();

		return "Product added successfully.";
	}

// 2. GET GetAll Products
	public List<Product> getAllProducts() {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Query<Product> query = session.createQuery("From Product ", Product.class);
		List<Product> products = query.getResultList();

		session.getTransaction().commit();
		return products;
	}

}
