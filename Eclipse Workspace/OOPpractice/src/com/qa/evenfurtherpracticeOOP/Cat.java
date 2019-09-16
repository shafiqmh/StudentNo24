package com.qa.evenfurtherpracticeOOP;

public class Cat extends Animal{
	public String name;
	public int age;
	public Cat (String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Cat (int age) {
		this.age = age;
	}
	public void speak() {
		System.out.println("meow");
		
	}
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}
	
	
}
