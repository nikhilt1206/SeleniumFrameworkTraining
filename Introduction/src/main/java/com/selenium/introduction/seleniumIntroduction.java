package com.selenium.introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumIntroduction {

	public static void main(String[] args) throws InterruptedException{

		//Invoking browser
		//Chrome - ChromeDriver -> METHODS (close, get etc)
		//Top of all these there is an interface - WebDriver (what to do)
		//Chrome Driver = WebDriver methods + class methods 
		//ChromeDriver driver = new ChromeDriver();
		
		
		//Edge Launch
		//System.setProperty("webdriver.edge.driver","/Users/nikhil/Documents/msedgedriver");
		//WebDriver driver = new EdgeDriver();
		
		//Firfox Launch
        //System.setProperty("webdriver.gecko.driver","/Users/nikhil/Documents/geckodriver");
	    //WebDriver driver = new FirefoxDriver();
		
		//step to invoke chromedriver manually 
		//System.setProperty("webdriver.chrome.driver", "/Users/nikhil/Documents/chromedriver");
		//latest selenium version - selenium manager will handle it (no need of setProperty)
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
		
		System.out.println("Current title: "+ driver.getTitle());
		System.out.println("Current Url: "+ driver.getCurrentUrl());
		if(driver.getPageSource().contains("Google")) {
			System.out.println("Text found");
		}
		Thread.sleep(5000);
		driver.quit();
	}

}
