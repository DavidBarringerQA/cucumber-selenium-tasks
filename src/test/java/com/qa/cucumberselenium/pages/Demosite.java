package com.qa.cucumberselenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Demosite{

	@FindBy(xpath="/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]")
	WebElement registerTab;

	@FindBy(xpath="/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]")
	WebElement loginTab;

	@FindBy(name="username")
	WebElement username;

	@FindBy(name="password")
	WebElement password;

	@FindBy(name="FormsButton2")
	WebElement submitButton;

	@FindBy(xpath="/html/body/table/tbody/tr/td[1]/blockquote/blockquote[2]/blockquote")
	WebElement result;

	@FindBy(xpath="/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")
	WebElement loginResult;

	public Demosite registerPage(){
		registerTab.click();
		return this;
	}

	public Demosite loginPage(){
		loginTab.click();
		return this;
	}

	public Demosite name(String name){
		username.sendKeys(name);
		return this;
	}

	public Demosite pass(String pass){
		password.sendKeys(pass);
		return this;
	}

	public Demosite submit(){
		submitButton.click();
		return this;
	}

	public String getName(){
		return result.getText().split(": ")[1].split("\n")[0];
	}

	public String getPass(){
		return result.getText().split(": ")[2];
	}

	public String getLoginResult(){
		return loginResult.getText();
	}
}
