package com.simplielearn.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitleCheck {

	
	public static void main(String[] args) {
		
		//step:1 Declare the Path of Google Chrome Driver
		System.setProperty("webdriver.chrome.driver", "D:\\Phase-5\\chromedriver_win32_Sept\\chromedriver.exe");
				
				
		//step:2 initializing webdriver
	    WebDriver driver= new ChromeDriver();
				
		//step:3 give a base url
		driver.get("http://www.google.com/");
				
		String actualTitle="";
		String expectedTitle="Google";
		
		actualTitle=driver.getTitle();
		
		System.out.println("Actual title: "+driver.getTitle());
		
		//comparison
		if(actualTitle.contentEquals(expectedTitle))
			System.out.println("Test case Passed");
		else
			System.out.println("Test Case failed");
				
		driver.close();
				
	}
}
