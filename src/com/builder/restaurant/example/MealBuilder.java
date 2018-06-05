package com.builder.restaurant.example;

import com.builder.restaurant.example.model.Coke;
import com.builder.restaurant.example.model.NonVegBurger;
import com.builder.restaurant.example.model.Pepsi;
import com.builder.restaurant.example.model.VegBurger;
import com.builder.restaurant.example.service.Meal;

public class MealBuilder {

	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;	
	}
	
	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new NonVegBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
	
}
