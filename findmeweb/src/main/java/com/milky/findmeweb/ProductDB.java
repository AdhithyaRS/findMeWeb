package com.milky.findmeweb;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductDB extends JpaRepository<Product, Integer> {

	public List<Product> findByLocationContaining(String name);

	public List<Product> findByTypeContaining(String str);

	public List<Product> findByQuantityGreaterThan(int i);

}
