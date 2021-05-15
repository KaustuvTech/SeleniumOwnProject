package com.w2a.reusableMethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReusableClass {
	
	
	public void setupWebDriver(String browser) {
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
		}else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
		}
	}

}
