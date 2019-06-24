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
	
	@Test
	public void MultiplyTwoNumbersTest() {
		Calculator calculator = new Calculator();
		int result = calculator.multiply(2,8);
		Assert.assertEquals(16, result);
	}
	
	@Test
	public void DivideTwoNumbersTest() {
		Calculator calculator = new Calculator();
		double result = calculator.divide(7,2);
		Assert.assertEquals(3.5, result, 0.01);
	}
	
}
