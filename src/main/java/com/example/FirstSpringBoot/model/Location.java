package com.example.FirstSpringBoot.model;

public class Location {

	private String id;
	private String name;

	public String getId() {
		return id;
	}

	public Location(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
