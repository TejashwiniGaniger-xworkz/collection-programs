package com.xworkz.groups;

import java.io.Serializable;

public class AlcoholDTO implements Serializable,Comparable<AlcoholDTO>{
	private String brand;
	private int price;
	private boolean scotch;
	private int quantity;
	private String type;
	
	AlcoholDTO(){
		
	}

	public AlcoholDTO(String brand, int price, boolean scotch, int quantity, String type) {
		super();
		this.brand = brand;
		this.price = price;
		this.scotch = scotch;
		this.quantity = quantity;
		this.type = type;
	}

	@Override
	public String toString() {
		return "AlcoholDTO [brand=" + brand + ", price=" + price + ", scotch=" + scotch + ", quantity=" + quantity
				+ ", type=" + type + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isScotch() {
		return scotch;
	}

	public void setScotch(boolean scotch) {
		this.scotch = scotch;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public int compareTo(AlcoholDTO o) {
		
		return (this.getBrand().compareTo(o.getBrand()));
	}

	
}
