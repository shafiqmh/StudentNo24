package com.qa.strings;

public class Strings {
	public static void main(String[] args) {
		
		//greeting();
		System.out.println(replace("hi there", "e", "x"));
	}
			
	public static String replace(String sentence, String before, String after) {
			String sentence2 = "";
			for (int i = 0; i < sentence.length(); i++) {
				if (sentence.substring(i,i+1).equals(before)) {
					sentence2 += after;
				} else {
					sentence2 += sentence.substring(i, i+1);
				}
			}
			System.out.println("Previously: " + sentence);
			return "Now: " + sentence2;
		}
	}


