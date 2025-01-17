package com.proton.order.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proton.order.Entity.Product;
import com.proton.order.Service.ProductService;

@RequestMapping("/api/v1/")
@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/products")
	public List<Product> getAllProduct() {
		return productService.listAllProduct();
	}
	
	
	@GetMapping("/product/{id}")
	public Optional<Product> getProduct(@PathVariable Long id) {
		return productService.singleProduct(id);
	} 
	
}
