package com.qa.cucumberselenium.hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class SeleniumHook{

	private WebDriver driver;

	@Before
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void teardown(){
		driver.quit();
	}

	@BeforeStep
	@AfterStep
	public void attachScreenshot(Scenario scenario){
		scenario.attach(takeScreenshot(), "image/png", scenario.getName());
	}
	

	public WebDriver getDriver(){
		return driver;
	}

	private byte[] takeScreenshot(){
		return((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	}
}
