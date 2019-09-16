package com.qa.Exercises;

public class Arrays {
	public static void main(String[] args) {
	
		/*	String[] row = {"Alex","Bartek","Vin"};
		System.out.println(row[0]);
		System.out.println(row[1]);
		System.out.println(row[2]);
		for (int i = 0; i < row.length; i++) {
			System.out.println(row[i]);
		}
		for (String person:row) {
			System.out.println(person); //enhanced for loop
		}*/
		
		String[][] classy = {{"Alex", "Bartek"},
			{"Matt", "Martin"},
			{"Shafiq", "Dylan"}};
		System.out.println(classy[1][0]); //prints Matt
	for (String[] row:classy)
		for (String person:row)
			System.out.println(person);
		System.out.println(classy); //return ram locations of array
		
String[][] classroom=new String[5][6];
classroom[3][4]="James";
System.out.println(classroom[3][4]);
}
}
