package com.qa.cucumberselenium;

import static org.junit.Assert.assertEquals;

import com.qa.cucumberselenium.hooks.SeleniumHook;
import com.qa.cucumberselenium.pages.Demosite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginRegisterStepDefinitions{

	private WebDriver driver;
	private Demosite page;

	public LoginRegisterStepDefinitions(SeleniumHook hook){
		this.driver = hook.getDriver();
		this.page = PageFactory.initElements(driver, Demosite.class);

		driver.manage().window().maximize();
	}

	@Given("I am at {word}")
	public void i_am_at(String url) {
		driver.get(url);
	}

	@Given("I am registering")
	public void i_am_registering() {
	  page.registerPage();
	}

	@Given("I input username {word}")
	public void i_input_username(String username) {
		page.name(username);
	}

	@Given("I input password {word}")
	public void i_input_password(String password) {
		page.pass(password);
	}

	@When("I click submit")
	public void i_click_submit() {
		page.submit();
	}

	@Then("I am registered")
	public void i_am_registered() {
    
	}

	@Then("my username is {word}")
	public void my_username_is(String username) {
		assertEquals(username, page.getName());
	}

	@Then("my password is {word}")
	public void my_password_is(String password) {
		assertEquals(password, page.getPass());
	}

	@Given("I am logging in")
	public void i_am_logging_in() {
		page.loginPage();
	}

	@Then("the login is successful")
	public void the_login_is_successful() {
		assertEquals("**Successful Login**", page.getLoginResult());
	}

}
