package com.qa.calculator;


import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void addTwoNumbersTogetherTest() {
		Calculator calculator = new Calculator();
		int result = calculator.add(2,2);
		Assert.assertEquals(4, result);
	}
	
	@Test
	public void subtractTwoNumbersTest() {
		Calculator calculator = new Calculator();
		int result = calculator.subtract(6,1);
		Assert.assertEquals(5, result);
	}

}
