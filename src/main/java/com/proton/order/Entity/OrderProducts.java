package com.proton.order.Entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="order_products")
public class OrderProducts implements Serializable {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Long id;

@Column(name="product_id")
Long productId;

@Column(name="orders_id")
Long orderId;

@ManyToOne
@JoinColumn(name = "orders_id", insertable=false, updatable=false)
private Orders orders;

@ManyToOne
@JoinColumn(name = "product_id", insertable=false, updatable=false)
private Product product;


public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}


public Orders getOrders() {
	return orders;
}

public void setOrders(Orders orders) {
	this.orders = orders;
}

public Long getProductId() {
	return productId;
}

public void setProductId(Long productId) {
	this.productId = productId;
}

public Long getOrderId() {
	return orderId;
}

public void setOrderId(Long orderId) {
	this.orderId = orderId;
}

public Product getProduct() {
	return product;
}

public void setProduct(Product product) {
	this.product = product;
}


}
