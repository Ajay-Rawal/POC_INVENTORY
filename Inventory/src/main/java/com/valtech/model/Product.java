package com.valtech.model;

public class Product {
	
	private int product_id;
	private String Product_name;
	private String description;
	private float price;
	private int Pquantity;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int product_id, String product_name, String description, float price, int pquantity) {
		super();
		this.product_id = product_id;
		this.Product_name = product_name;
		this.description = description;
		this.price = price;
		this.Pquantity = pquantity;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return Product_name;
	}
	public void setProduct_name(String product_name) {
		Product_name = product_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getPquantity() {
		return Pquantity;
	}
	public void setPquantity(int pquantity) {
		Pquantity = pquantity;
	}
	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", Product_name=" + Product_name + ", description=" + description
				+ ", price=" + price + ", Pquantity=" + Pquantity + "]";
	}
	
	

}
