package com.salima.testingProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void Addtest() {
		//Arrange
		final int x = 1;
		final int y = 2;
		Calculator calculator = new Calculator();
		//Act
		int som = calculator.add(x,y);
		//Assert
		assertEquals(3, som);
	}
	

}
