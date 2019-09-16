package com.qa.garageExercise;

public class VehicleBuilder {
	private int id = 000000;
	private int hp;
	
	public VehicleBuilder() {}
	
	public Vehicle buildVehicle() {
		return new Vehicle(id, hp);
	}
	public VehicleBuilder id(int _id) {
		this.id = _id;
		return this;
	}
	public VehicleBuilder hp(int _hp) {
		this.hp = _hp;
		return this;
	}
}
