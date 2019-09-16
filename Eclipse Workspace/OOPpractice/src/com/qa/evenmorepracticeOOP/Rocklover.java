package com.qa.evenmorepracticeOOP;

public class Rocklover extends Penguin {
	public String music;
	public Rocklover(String fluffiness, String music) {
		super(fluffiness);
		this.music = music;
	}
	public void dance() {
		System.out.println("tap tap");
	}

}
