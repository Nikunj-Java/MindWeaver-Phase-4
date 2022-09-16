package com.simplielearn.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {
	
	public static void main(String[] args) {
		
				//step:1 Declare the Path of Google Chrome Driver
				String path="D:\\Phase-5\\chromedriver_win32_Sept\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", path);
				
				//step:2 initializing webdriver
				WebDriver driver= new ChromeDriver();
				
				//step: give a base url
				String url="https://www.shine.com/register/general/";
				driver.get(url);
				
				
				//getting name
				WebElement name= driver.findElement(By.id("id_name"));
				name.sendKeys("Nikunj Soni");
		
	}

}
