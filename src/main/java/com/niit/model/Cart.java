package com.niit.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Cart {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private double  grandTotal;
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public List<CartItem> getCartItems() {
	return cartItems;
}
public void setCartItems(List<CartItem> cartItems) {
	this.cartItems = cartItems;
}
@OneToOne
@JoinColumn(name="customer_id")
private Customer customer;
@OneToMany(mappedBy="cart",fetch=FetchType.EAGER)
private List<CartItem> cartItems;
public int getId(){
	return id;
}
public void setId(int id){
	this.id=id;
}
public double getGrandTotal(){
	return grandTotal;
}
public void setGrandTotal(double grandTotal){
	this.grandTotal=grandTotal;
}
}
