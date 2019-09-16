package com.qa.demoproject;

public class Tennis extends Game{
	
	@Override
	public int getScore() { //overriding
		return super.getScore()*15;
	}
	public Tennis(int score, int timeInMinutes, String name) {
		super(score, timeInMinutes, name);
	}
	
}
