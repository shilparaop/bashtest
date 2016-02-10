package com.cucumber;

import org.openqa.selenium.By;

public class LoginPage extends BaseMain{

	public void doLogin(String userName, String password){
		driver.findElement(By.id("txtUsername")).sendKeys(userName);;
		driver.findElement(By.id("txtPassword")).sendKeys(password);;
	
	}
	
	public boolean isOnLoginPage(){
		return driver.findElement(By.id("btnLogin")).isDisplayed();
	}

	public LandingPage clickOnSubmitButton() {
		driver.findElement(By.id("btnLogin")).click();
		return new LandingPage();

	}

	public boolean isDahboardPresent() {
		
		 return driver.findElement(By.xpath("//*[@id='content']/div/div[1]/h1")).isDisplayed();
		
	}

	public boolean isLogoutPresent() {
		
	driver.findElement(By.id("welcome")).click();
	return driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[4]")).isDisplayed();
		
	}

	public boolean isWelcomePresent() {
		
		return driver.findElement(By.id("welcome")).isDisplayed();
	}

	public boolean isRetryloginPresent() {
		
		return driver.findElement(By.xpath("//*[@id='content']/div[1]/div[2]/h1")).isDisplayed();
	}
}
