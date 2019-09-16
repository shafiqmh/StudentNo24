package com.qa.morepracticeOOP;

public class Mouse {
	private String belly = "empty";   // only allows specific entries ("bloated" wouldn't be allowed)
	public void eat() {
		belly = "Full";
	}
	public void crap() {
		belly = "empty";
	}
	public String getbelly() {
		return belly;
		}
	
	public void setbelly(String belly) {
		if (belly.equals("Full") || belly.equals("empty")) {
			this.belly = belly;
		}
	}
}
