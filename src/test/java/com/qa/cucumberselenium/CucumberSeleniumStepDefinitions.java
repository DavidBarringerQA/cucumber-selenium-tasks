package com.qa.cucumberselenium;

import static org.junit.Assert.assertEquals;
import com.qa.cucumberselenium.hooks.SeleniumHook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberSeleniumStepDefinitions{

	private WebDriver driver;

	public CucumberSeleniumStepDefinitions(SeleniumHook hook){
		this.driver = hook.getDriver();

		driver.manage().window().maximize();
	}

	@Given("at a search engine")
	public void at_a_search_engine() {
    driver.get("https://bing.com");
	}

	@When("I search for {string}")
	public void i_search_for(String search) {
		driver.findElement(By.id("sb_form_q")).sendKeys(search);
		driver.findElement(By.xpath("//*[@id=\"search_icon\"]")).click();
	}
	
	@Then("the title is {string}")
	public void the_title_is(String title) {
    assertEquals(title,  driver.getTitle());
	}
}
