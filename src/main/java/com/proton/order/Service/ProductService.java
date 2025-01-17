package com.proton.order.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proton.order.Entity.Product;
import com.proton.order.Repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	

	public List<Product> listAllProduct() {
		return (List<Product>) productRepository.findAll();
	}
	
	public Optional<Product> singleProduct(Long id) {
		return productRepository.findById(id);
	}
}
