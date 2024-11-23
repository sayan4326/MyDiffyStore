package com.mydiffystore.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Cart {
	@Id
	private Integer cartId;
	private Double totalAmount;
	@ManyToOne
	@JoinColumn(name = "buyer_id")
	private DiffyUser user;
	@OneToMany(mappedBy = "cart")
	private List<CartProduct> cartProducts;
	
	public Integer getCartId() {
		return cartId;
	}
	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public List<CartProduct> getCartProducts() {
		return cartProducts;
	}
	public void setCartProducts(List<CartProduct> cartProducts) {
		this.cartProducts = cartProducts;
	}
	public DiffyUser getUser() {
		return user;
	}
	public void setUser(DiffyUser user) {
		this.user = user;
	}
	
	
}
