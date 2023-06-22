package com.milky.findmeweb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@Autowired
	ProductService service;
	
	@PostMapping("/product")
	public void addproduct(@RequestBody Product p) {
		service.addProduct(p);
	}

	@GetMapping("/products")
	public List<Product> getAllProduct() {
		return service.DisplayAll();
		
	}
	
	@GetMapping("/products/location/{name}")
	public List<Product> getProductByLocation(@PathVariable String name) {
		return service.FilterLocation(name);
	}
	
	@GetMapping("/products/type/{name}")
	public List<Product> getProductByType(@PathVariable String name) {
		return service.FilterType(name);
	}
	
	@GetMapping("/products/quantity/{name}")
	public List<Product> getProductByQuantity(@PathVariable int name) {
		return service.FilterQuantity(name);
	}
	

}
