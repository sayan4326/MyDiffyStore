package com.mydiffystore.model;

public class CartProduct {
private Integer cpId;
private Cart cart;
private Product product;
private Integer quantity;
public Integer getCpId() {
	return cpId;
}
public void setCpId(Integer cpId) {
	this.cpId = cpId;
}
public Cart getCart() {
	return cart;
}
public void setCart(Cart cart) {
	this.cart = cart;
}
public Product getProduct() {
	return product;
}
public void setProduct(Product product) {
	this.product = product;
}
public Integer getQuantity() {
	return quantity;
}
public void setQuantity(Integer quantity) {
	this.quantity = quantity;
}

}
