package com.cts.demo.junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SimpleCalculatorTest {

	private static SimpleCalculator calc = null;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("---beforeClass---");
		calc = new SimpleCalculator();
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("---afterClass---");
		calc =null;
	}

//	@Before
//	public void beforeMethod() {
//		System.out.println("---beforeMethod---");
//		
//	}
//
//	@After
//	public void afterMethod() {
//		System.out.println("---afterMethod---");
//		
//	}

	@Test
	public void testAdd() {
		double expectedResult = 40.00;
		double actualResult = calc.add(30.12, 10.08);
		assertEquals("Addition Test: ", expectedResult, actualResult, 2);
	}

	@Test
	public void testSub() {
		double expectedResult = 20;
		double actualResult = calc.sub(30, 10);
		assertEquals("Subtraction Test: ", expectedResult, actualResult, 0);
	}

	@Test
	public void testMul() {
		double expectedResult = 300;
		double actualResult = calc.mul(30, 10);
		assertEquals("Multiplication Test: ", expectedResult, actualResult, 0);
	}
}
