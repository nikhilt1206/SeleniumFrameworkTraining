package com.practice.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) {

		
		//Open the browser (not used anymore, Selenium manager will handle this step automatically)
		//System.setProperty("webdriver.chrome.driver", "/Users/nikhil/Documents/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		//Lauch chrome and open the URL given
		driver.get("https://google.com");
		
		//To get the title of the current web page
		String title = driver.getTitle();
		System.out.println("Title: "+title);
		
		//To get the URL of the current web page
		String currentURL = driver.getCurrentUrl();
		System.out.println("Current URL :"+currentURL);
		
		//To close the browser
		driver.close();

	}

}
