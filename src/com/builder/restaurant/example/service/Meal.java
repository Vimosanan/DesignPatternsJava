package com.builder.restaurant.example.service;

import java.util.ArrayList;
import java.util.List;

import com.builder.restaurant.example.Item;

public class Meal {
	
	private List<Item> items = new  ArrayList<>();
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public float getTotalCost() {
		float cost = 0.0f;
		
		for(Item item: items) {
			cost += item.price();
		}
		return cost;
	}
	
	public void showItem() {
		for(Item item: items) {
			System.out.print("Item : " + item.name() );
			System.out.print(" packed in " + item.packing().pack());
			System.out.println(" which valued LKR " + item.price());
		}
	}
}
