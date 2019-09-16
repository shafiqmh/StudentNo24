package com.qa.Exercises;

public class SoloExercises {
	public static void main(String[] args) {
		//maths();
		//results();
		//conditionals();
		//taxes();
		numbers_1to100();
	}
		
	public static void maths() {
			
		int a = 3;
		int b = 5;
		System.out.println(a + b);
		System.out.println(a*b);
		System.out.println(a-b);
		if (a<b) {
			System.out.println("Division cannot be performed");
			}
		else System.out.println((double) a/b);
		}
	public static void results() {
		int Physics = 10;
		int Chemistry = 55;
		int Biology = 12;
		int Total = Physics + Chemistry + Biology;
		int Percentage = Total*100/450;
		
		System.out.println("Physics Result is: " + Physics);
		System.out.println("Chemistry Result is: " + Chemistry);
		System.out.println("Biology Result is: " + Biology);
		System.out.println("Total is: " + Total);
		System.out.println("Percentage: " + (double) Percentage + "%");
		
		int count=0;
		if (Percentage<60) {
			System.out.println("Your percentage is below 60%!");
		}
		if (Physics/1.5<60) {
			count++;
		}
		if (Chemistry/1.5<60) {
			count++;
		}
		if (Biology/1.5<60) {
			count++;
		}
		System.out.println("You have failed " + count + " module(s)!");
		
	}
	public static void conditionals() {
		int a = 10;
		int b = 10;
		if (a>=b) {
			System.out.println(a+b);
		}
		else {
			System.out.println(a*b);
		}
	}
	public static void taxes() {
		int salary = 23500;
		int tax = 0;
		if (salary < 15000) {
			tax = 0;
		}
		else if (salary<20000) {
			tax = 10;
		}
		else if (salary<30000) {
			tax = 15;
		}
		else if (salary<45000) {
			tax = 20;
		}
		else if (45000<=salary) {
			tax = 25;
		}
		double takeHome = salary - salary*tax/100;
		System.out.println("For a salary of £" + salary + ", " + tax + "% tax will be applied.");
		System.out.println("Salary after tax is: £" + takeHome);
	
	
	
	
	}
	public static void numbers_1to100() {
		
		String one[] = { " ", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten",
				" Eleven", " Twelve", " Thirteen", " Fourteen", "Fifteen", " Sixteen", " Seventeen", " Eighteen",
				" Nineteen" };
 
		String ten[] = { " ", " ", " Twenty", " Thirty", " Forty", " Fifty", " Sixty", "Seventy", " Eighty", " Ninety" };
		int n=35;
		if (n > 19)
		{
			System.out.print(ten[n / 10] + " " + one[n % 10]);
		}
		else
		{
			System.out.print(one[n]);
		}
		if (n > 0)
			System.out.print("dsfsdsd");
		
		
	}
}