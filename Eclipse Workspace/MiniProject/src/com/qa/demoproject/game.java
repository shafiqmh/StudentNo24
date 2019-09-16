package com.qa.demoproject;

public class game extends sports_game {
	private int score;
	private int timeInMinutes;
	
	public void addToScore(int score) {
		this.score = this.score + score; //same as doing '+='
	}
	public void additionalTime(int time) {
		this.timeInMinutes += time;  
	}
	public void setScore(int score) {
		this.score= score;
	}
	public int getScore() {
		return this.score;
	}
	public void settimeInMinutes(int time) {
		this.timeInMinutes = time;
	}
	public int gettimeInMinutes() {
		return this.timeInMinutes;
	}
	
}
