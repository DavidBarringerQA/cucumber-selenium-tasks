package com.qa.cucumberselenium;

import static org.junit.Assert.assertEquals;
import com.qa.cucumberselenium.hooks.SeleniumHook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutomationStepDefinitions{

	private WebDriver driver;

	public AutomationStepDefinitions(SeleniumHook hook){
		this.driver = hook.getDriver();

		driver.manage().window().maximize();
	}
	
	@Given("I am on frame {int}")
	public void i_am_on_frame(Integer int1) {
		driver.switchTo().frame(int1);
	}

	@When("I click item {int}")
	public void i_click_item(Integer int1) {
		String selector = "#selectable > li:nth-child(" + int1 + ")";
		driver.findElement(By.cssSelector(selector)).click();
	}

	@Then("{string} is highlighted")
	public void is_highlighted(String expected) {
		assertEquals(expected, driver.findElement(By.className("ui-selected")).getText());
	}

	@Given("I go to input alert")
	public void i_go_to_input_alert() {
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/div[1]/div[1]/ul/li[2]/a")).click();
	}

//	@When("I click the button")
//	public void i_click_the_button() {
//	}

	@When("I input {string}")
	public void i_input(String string) {
    driver.findElement(By.xpath("/html/body/button")).click();
    Alert alert = driver.switchTo().alert();
		alert.sendKeys(string);
		alert.accept();
	}

	@Then("I see {string}")
	public void i_see(String string) {
		assertEquals(string, driver.findElement(By.id("demo")).getText());
	}
}
