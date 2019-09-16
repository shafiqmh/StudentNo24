package com.qa.someinheritance;

public class App {
	public static void main(String[] args) {
		Bird birdy = new Bird();
		FlyingCreature flyboy = (FlyingCreature) Bird;
		Hairy hairyboy = (Hairy) Bird;
		
	}
}
