package com.builder.restaurant.example;

import com.builder.restaurant.example.service.Meal;

public class BuilderDesignPatternDemo {

	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		
		Meal vegMeal = mealBuilder.prepareVegMeal();
		 System.out.println("Veg Meal");
		vegMeal.showItem();
		System.out.println("Total cost: " +vegMeal.getTotalCost());
		
		
		System.out.println();
		
		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		 System.out.println("Non Veg Meal");
		nonVegMeal.showItem();
		System.out.println("Total Cost: " + nonVegMeal.getTotalCost());
	}
}
