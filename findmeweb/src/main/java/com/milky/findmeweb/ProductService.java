package com.milky.findmeweb;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Component
public class ProductService {
	
	
	@Autowired
	ProductDB db;
	
	public void addProduct(Product p) {
		db.save(p);
	}
	
	
	public List<Product> DisplayAll() {
		
		return db.findAll();
	}
	
	

	public List<Product> FilterLocation(String str) {
		// TODO Auto-generated method stub
		return db.findByLocationContaining(str);
	}


	public List<Product> FilterType(String str) {
		// TODO Auto-generated method stub
		return db.findByTypeContaining(str);
	}


	public List<Product> FilterQuantity(int i) {
		// TODO Auto-generated method stub
		return db.findByQuantityGreaterThan(i);
	}


//	public List<Product> FilterLocation(String str) {
//		List<Product> temp = db.FilterLocation(str);
//		return temp;
//	}
	

}
