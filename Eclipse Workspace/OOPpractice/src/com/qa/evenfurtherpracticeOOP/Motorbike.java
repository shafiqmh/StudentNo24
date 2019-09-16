package com.qa.evenfurtherpracticeOOP;

public class Motorbike extends Vehicle{
	private int hp;
	public Motorbike(int id, int hp) {
		super(id);
		this.hp = hp;
	}
	public String getHp() {
		return "Motorbike HP : " + hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
}