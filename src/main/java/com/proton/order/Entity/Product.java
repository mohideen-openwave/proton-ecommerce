package com.proton.order.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="product")
public class Product {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
Long id;
String name;
String description;
String price;

@Column(name="image_url")
String imageURL;

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public String getImageURL() {
	return imageURL;
}
public void setImageURL(String imageURL) {
	this.imageURL = imageURL;
}


}
