package com.qa.Collections;

import java.util.stream.Stream;
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class App {
	public static void main(String[] args) {
		//ArrayList<Integer> nums = new ArrayList<Integer>();
		
		Stream<Long> to_thous = Stream.iterate(1L, n -> n+1).limit(1000);
		to_thous.forEach((System.out::println)*(System.out::println));
		//List<Integer> nums = Arrays.asList();
		//List<Integer> square = nums.stream().map(n -> n*n).collect(Collectors.toList());
		//System.out.println(square); 
		
		
		
		
		/*int[] numbers;
		numbers = new int[1000];
		
		for (int i=0; i<numbers.length; i++) {
			numbers[i] = i+1;
			System.out.println(numbers[i]*numbers[i]);
		}*/
		}
	}
}
