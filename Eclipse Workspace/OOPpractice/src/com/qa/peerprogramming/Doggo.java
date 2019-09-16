package com.qa.peerprogramming;

public class Doggo {
	public static void main(String[] args) {
		dogPlace(33);
			
	}
	
	public static void dogPlace(int place) {
		for (int i = 1; i <= 100; i++) {
			//System.out.println(i);
			
			// If value is under 10
			int k = i%10;
			
			if (i == place) { continue; }
			if (i==11 || i==12 || i==13) {
				System.out.println(i + "th");
			}
			else if (k == 0 || k > 3) {
				System.out.println(i + "th");
				}
			else if (k==1) {
				System.out.println(i + "st");
				}
			else if (k==2) {
				System.out.println(i + "nd");
				}
			else if (k==3) {
				System.out.println(i + "rd");
				}
			}
	}
}
	
