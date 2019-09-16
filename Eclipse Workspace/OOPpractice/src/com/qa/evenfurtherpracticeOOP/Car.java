package com.qa.evenfurtherpracticeOOP;

public class Car extends Vehicle {
	private int wheels;
	public Car(int id, int wheels) {
		super(id);
		this.wheels = wheels;
	}
	public String getWheels() {
		return "Car wheels: " + wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	@Override
	public String toString() {
			return "ID=" + id + " wheels=" + wheels;
	}
	
}
