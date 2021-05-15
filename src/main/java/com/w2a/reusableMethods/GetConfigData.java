package com.w2a.reusableMethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GetConfigData {
	
	public Properties prop=new Properties();
	public FileInputStream file=null;
	public void loadFile(String fileLocation) throws FileNotFoundException {
		
		file=new FileInputStream(fileLocation);
		try {
			prop.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String url() {
		try {
			loadFile("D:\\Selenium\\SeleniumProjectsPractice\\SeleniumDemoClass\\src\\main\\java\\com\\w2a\\configFiles\\config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("file not loaded yet");
		}
		return prop.getProperty("url");
		
		
	}
	
	public String browser() {
		
		try {
			loadFile("D:\\Selenium\\SeleniumProjectsPractice\\SeleniumDemoClass\\src\\main\\java\\com\\w2a\\configFiles\\config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("file not loaded yet");
		}
		return prop.getProperty("browser");
		
	}

}
