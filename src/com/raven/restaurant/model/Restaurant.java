package com.raven.restaurant.model;

public class Restaurant {
	private String res_id;
	private String name;
	private String location;
	private String email_id;
	public Restaurant(String res_id, String name, String location, String email_id) {
		super();
		this.res_id = res_id;
		this.name = name;
		this.location = location;
		this.email_id = email_id;
	}
	public String getRes_id() {
		return res_id;
	}
	public void setRes_id(String res_id) {
		this.res_id = res_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	
}
