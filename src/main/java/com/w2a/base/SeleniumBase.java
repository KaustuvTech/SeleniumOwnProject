package com.w2a.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.w2a.reusableMethods.GetConfigData;
import com.w2a.reusableMethods.ReusableClass;

public class SeleniumBase {
	ReusableClass reusableClass = new ReusableClass();
	GetConfigData configData = new GetConfigData();

	public static WebDriver driver;
	String browser = "chrome";

	@BeforeSuite
	public void setup() {
		reusableClass.setupWebDriver(configData.browser());
		if(configData.browser().equals("chrome")) {
		driver = new ChromeDriver();
		}
		driver.get(configData.url());

	}

	@AfterSuite
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

}
