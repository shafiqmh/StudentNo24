package com.qa.garageExercise;

public class Garage /*extends Vehicle*/ {
	public static void main(String[] args) {
		System.out.println("This is my Garage:");
	
	
	Vehicle v1 = new VehicleBuilder().id(001101).buildVehicle();
	Vehicle v2 = new VehicleBuilder().id(001102).hp(120).buildVehicle();
	
	
	System.out.println("id: " + v1.id + "hp: " + v1.hp);
	System.out.println("id: " + v2.id + "id: " + v2.hp);
	}
}





// "Vehicle ID: " + id + "Vehicle name: " + name + "Vehicle colour: " + colour