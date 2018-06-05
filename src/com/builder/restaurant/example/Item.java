package com.builder.restaurant.example;

import com.builder.restaurant.example.service.Packing;

public interface Item {
	public String name();
	public Packing packing();
	public float price();
}
