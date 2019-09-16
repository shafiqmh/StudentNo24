package com.qa.firstApplication;

public class App {
	public static void main(String[] args) {
		transfer();
	}
	
	public static void transfer() {
		for(int i=0; i<=10; i++) {
			if(i==4) {
				continue;
			}else if(i==7) {
				break;
			}else {
				System.out.println(i);
			}
		}
	}

}
