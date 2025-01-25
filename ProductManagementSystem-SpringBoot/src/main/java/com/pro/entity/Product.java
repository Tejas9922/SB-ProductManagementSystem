package com.pro.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	private int id;
	private String name;
	private int price;
	private int mng;
	private int exp;
	private String category;
	public Product() {
		super();
	}
	public Product(int id, String name, int price, int mng, int exp, String category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.mng = mng;
		this.exp = exp;
		this.category = category;
	}
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getMng() {
		return mng;
	}
	public void setMng(int mng) {
		this.mng = mng;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", mng=" + mng + ", exp=" + exp
				+ ", category=" + category + "]";
	}
	
	
}
