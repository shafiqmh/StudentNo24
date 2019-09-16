package com.qa.peerprogramming;

public class Porridge {
	public static void main(String[] args) {
		System.out.println("fnue");
		int[][] cAndP = {
				{30, 50},
				{130, 60},
				{90, 60},
				{150, 85},
				{120, 70},
				{200, 200},
				{110, 100}
				};
		
		int weight = 100;
		int temp = 80;
		int count = 0;
		
		
		for(int[] pCSet : cAndP) {
			count++;
			if(pCSet[0] > weight && pCSet[1] < temp) {
				System.out.println(count);
			}
		}
	}
}
