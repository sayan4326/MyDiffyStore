package com.mydiffystore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Product {
	@Id
	private Integer productId;
	private String productName;
	private Double price;
	@OneToOne
	@JoinColumn(name = "seller_id")
	private DiffyUser seller;
	@OneToOne
	@JoinColumn(name = "category_id")
	private Category category;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public DiffyUser getSeller() {
		return seller;
	}

	public void setSeller(DiffyUser seller) {
		this.seller = seller;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
