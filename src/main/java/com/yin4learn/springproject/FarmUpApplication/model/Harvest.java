package com.yin4learn.springproject.FarmUpApplication.model;

// import lombok.Data;

// @Data
public class Harvest {

	private String name;
	private Integer qty;
	private Float price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
}
