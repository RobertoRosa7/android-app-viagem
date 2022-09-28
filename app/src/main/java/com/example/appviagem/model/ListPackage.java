package com.example.appviagem.model;

import java.math.BigDecimal;

public class ListPackage {
	private String local;
	private String image;
	private int days;
	private BigDecimal price;

	public ListPackage(String local, String image, int days, BigDecimal price) {
		this.local = local;
		this.image = image;
		this.days = days;
		this.price = price;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
}
