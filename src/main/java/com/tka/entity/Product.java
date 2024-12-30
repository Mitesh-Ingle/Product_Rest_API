package com.tka.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private long productId;
	private String productName;
	private int prodcutQty;
	private double productPrice;

	public Product(long productId, String productName, int prodcutQty, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.prodcutQty = prodcutQty;
		this.productPrice = productPrice;
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProdcutQty() {
		return prodcutQty;
	}

	public void setProdcutQty(int prodcutQty) {
		this.prodcutQty = prodcutQty;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", prodcutQty=" + prodcutQty
				+ ", productPrice=" + productPrice + "]";
	}

}
