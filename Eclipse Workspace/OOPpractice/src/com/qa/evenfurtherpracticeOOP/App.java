package com.qa.evenfurtherpracticeOOP;

import java.util.ArrayList;

public class App {
	
	public static void main(String[] args) {
		//vehicular();
		//cat();	
	}
	
	public static void cat() {
		Cat cat1 = new Cat("jennifer", 3);
		Cat cat2 = new Cat(5);
		System.out.println(cat1.name +" aged " +cat1.age);
		System.out.println("Stray aged " + cat2.age);
		
		Cat cat3 = new Cat(10);
		cat3.speak();
		Animal cat4 = (Animal) cat3;
		cat4.speak();
		
		System.out.println("");
		System.out.println("Overriding and input into array:");
		Animal cat5 = new Cat("kitty", 7);
		Animal dog1 = new Dog();
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(cat5);
		animals.add(dog1);
		for (Animal a : animals) {
			a.speak();
		}
		System.out.println("");
		Animal cat6 = new Cat("pound", 6);
		cat6.speak();
		Animal dog2 = new Dog();
		dog2.speak();
		
		System.out.println("");
		System.out.println("String toString");
		System.out.println(cat6);
			
			
	}
	
	
	public static void vehicular(){
		
		Car car1 = new Car(00112, 4);
		Motorbike bike1 = new Motorbike(00223,10);
		Vehicle veh1 = (Vehicle) car1;
		Vehicle veh2 = (Vehicle) bike1;
		
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(veh1);
		vehicles.add(veh2);
		
		for (Vehicle v: vehicles) {
			if (v instanceof Car) {
				Car car = (Car) v;
				System.out.println(car.getId());
				System.out.println(car.getWheels());
				}
			else if (v instanceof Motorbike) {
				Motorbike mbike = (Motorbike) v;
				System.out.println(mbike.getId());
				System.out.println(mbike.getHp());
				}
			}
		System.out.println("");
		System.out.println(veh1.getId());
		System.out.println(veh2.getId());
		
		System.out.println("");
		System.out.println("String toString");
		System.out.println(veh1); //only works when vehicle class is public
		//System.out.println(veh1.getId().toString()); //alternative method
		}
	}


