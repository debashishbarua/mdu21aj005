package com.cts.demo.junit;

public class SimpleCalculator implements BasicMathOperation {

	
	@Override
	public double add(double numberOne, double numberTwo) {
	
		return numberOne + numberTwo;
	}

	@Override
	public double sub(double numberOne, double numberTwo) {
		
		return numberOne - numberTwo;
	}
	

	@Override
	public double mul(double numberOne, double numberTwo) {
	
		return numberOne *  numberTwo;
	}
	

}
