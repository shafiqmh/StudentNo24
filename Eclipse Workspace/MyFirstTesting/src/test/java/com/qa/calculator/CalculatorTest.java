package com.qa.calculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void addTest() {
		Calculator calculator = new Calculator();
		assertEquals(7,	calculator.add(3,4));
	}
	
	
}
