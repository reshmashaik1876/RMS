package com.raven.restaurant.model;

public class MenuItem {
	private String menu_item;
	private String name;
	private String dish;
	public MenuItem(String menu_item, String name, String dish) {
		super();
		this.menu_item = menu_item;
		this.name = name;
		this.dish = dish;
	}
	public String getMenu_item() {
		return menu_item;
	}
	public void setMenu_item(String menu_item) {
		this.menu_item = menu_item;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDish() {
		return dish;
	}
	public void setDish(String dish) {
		this.dish = dish;
	}
	
}
