package com.qa.cucumberselenium.hooks;

import com.qa.cucumberselenium.Calculator;
import io.cucumber.java.Before;

public class CalculatorHook{

	private Calculator calc;

  @Before
	public void setup(){
		this.calc = new Calculator();
	}

	public Calculator getCalculator(){
		return calc;
	}
}
