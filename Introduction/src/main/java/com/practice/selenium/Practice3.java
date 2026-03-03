package com.practice.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 {

	public static void main(String[] args) throws InterruptedException{

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://google.com");
		
		//To enter the url
		driver.navigate().to("https://www.instagram.com/");
		Thread.sleep(2000);
		
		//To navigate to previous page
		driver.navigate().back();
		Thread.sleep(2000);
		
		//To navigate to next page 
		driver.navigate().forward();
		Thread.sleep(2000);
		
		//Refresh current web page
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.close();
		
	
	}

}
