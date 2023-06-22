package com.milky.findmeweb;

import jakarta.persistence.Entity;

//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Product {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String type;
	private String location;
	private int quantity;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

	//private Image imgProduct;
	
	//private Image imgLocation;
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", type=" + type + ", location=" + location + ", quantity=" + quantity + "]";
	}
	
	public Product(String name, String type, String location, int quantity) {
		super();
		this.name = name;
		this.type=type;
		this.quantity = quantity;
		//this.imgProduct = imgProduct;
		this.location = location;
		//this.imgLocation = imgLocation;
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}

	
	
	
	

}
