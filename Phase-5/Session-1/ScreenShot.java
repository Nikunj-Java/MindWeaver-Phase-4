package com.simplielearn.demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "D:\\Phase-5\\chromedriver_win32_Sept\\chromedriver.exe");
		
	    WebDriver driver= new ChromeDriver();
	
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.facebook.com/");
	    
	    TakesScreenshot screenshot= (TakesScreenshot)driver;
	    File src= screenshot.getScreenshotAs(OutputType.FILE);
	    
	    
	    try {
			FileHandler.copy(src, new File("D://Screenshot//Facebook.png"));
			System.out.println("Screenshot saved successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    driver.close();
	    
	}
}
