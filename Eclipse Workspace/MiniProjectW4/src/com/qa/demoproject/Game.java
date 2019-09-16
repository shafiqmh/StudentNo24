package com.qa.demoproject;

public class Game extends Sports_Game {
	private String name;
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
	
	public Game() {}
	public Game(int Score, int timeInMinutes, String name) { //constructor
		this.score = score;
		this.name = name;
		this.timeInMinutes = timeInMinutes;
	}
	public Game(int score, String name) { //overloading
		this.score = score;
		this.name = name;
	}
	
}
