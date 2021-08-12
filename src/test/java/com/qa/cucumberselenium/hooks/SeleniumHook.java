package com.qa.cucumberselenium.hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class SeleniumHook{

	private WebDriver driver;

	@Before("@selenium")
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After("@selenium")
	public void teardown(){
		driver.quit();
	}

	public WebDriver getDriver(){
		return driver;
	}
}
