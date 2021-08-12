package com.qa.cucumberselenium;

import static org.junit.Assert.assertEquals;

import com.qa.cucumberselenium.hooks.CalculatorHook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorStepDefinitions{

	private Calculator calc;
	private double num1, num2, result;

	public CalculatorStepDefinitions(CalculatorHook hook){
		this.calc = hook.getCalculator();
	}

	@Given("first number {double}")
	public void first_number(double num1) {
		this.num1 = num1;
	}

	@Given("second number {double}")
	public void second_number(double num2) {
		this.num2 = num2;
	}

	@When("numbers are added")
	public void numbers_are_added() {
		result = this.calc.add(num1, num2);
	}

	@Then("result is {double}")
	public void result_is(double result) {
		assertEquals(result, this.result, 0.0001);
	}

}
