package com.builder.restaurant.example.model;

import com.builder.restaurant.example.Item;
import com.builder.restaurant.example.service.Packing;
import com.builder.restaurant.example.service.Wrapper;

public abstract class Burger implements Item {
	
	@Override
	public Packing packing() {
		return new Wrapper();
	}
	
	@Override
	public abstract float price();
}
