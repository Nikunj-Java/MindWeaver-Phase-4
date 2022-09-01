package com.simplielearn.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageTest {
	
	public static void main(String[] args) {
		
		//download selenium-server-3.5.0.jar and selenium-java-3.5.0.zip from previous releases from below link
		//link: selenium.dev/downloads/
		
		//download the google chrome driver as per your google chrome version
		//to  check your google chrome version goto> googlechrome>help>about google chrome > check your verison
		//to download driver: https://chromedriver.chromium.org/downloads
		
		//step:1 Declare the Path of Google Chrome Driver
		String path="D:\\Phase-5\\chromedriver_win32_Sept\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		
		//step:2 initializing webdriver
		WebDriver driver= new ChromeDriver();
		
		//step: give a base url
		String url="http://www.google.com/";
		driver.get(url);
		
		System.out.println("WebDriver is working Properly");
		
		driver.close();
		
	}

}
