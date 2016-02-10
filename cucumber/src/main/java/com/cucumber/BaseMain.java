package com.cucumber;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseMain {

	static WebDriver driver;

	public void openBrowser() throws IOException {
		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream("C:/Users/shilpa/workspace/cucumber/src/test/resources/config.properties");
		prop.load(fs);
		String URL = prop.getProperty("URL");
		String broswer = prop.getProperty("browser");
		if (broswer.matches("firefox"))
			driver = new FirefoxDriver();

		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	}

	public void closeBrowser() {
		driver.quit();
	}
}
