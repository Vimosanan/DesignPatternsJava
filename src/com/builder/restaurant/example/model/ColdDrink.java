package com.builder.restaurant.example.model;

import com.builder.restaurant.example.Item;
import com.builder.restaurant.example.service.Bottle;
import com.builder.restaurant.example.service.Packing;

public abstract class ColdDrink implements Item {
	
	@Override
	public Packing packing() {
		return new Bottle();
	}
	
	@Override
	public abstract float price();

}
