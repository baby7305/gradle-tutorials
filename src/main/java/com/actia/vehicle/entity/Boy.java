package com.actia.vehicle.entity;

public class Boy {
	private String name;

	public Boy() {
	}

	public Boy(String name) {
		this.name = name;
	}

	public String greeting() {
		return this.name + ":hello";
	}
}
