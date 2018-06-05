package com.builder.restaurant.example.model;

public class NonVegBurger extends Burger{

	@Override
	public String name() {
		return "Non-Veg Burger";
	}

	@Override
	public float price() {
		return 55.0f;
	}

}
