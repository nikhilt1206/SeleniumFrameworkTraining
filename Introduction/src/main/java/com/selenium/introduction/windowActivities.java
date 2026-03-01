package com.selenium.introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class windowActivities {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com"); //it will wait for the page to be fully loaded
		driver.navigate().to("https://academy.postman.com/");//it won't wait for page to be fully loaded (need to handle wait)
		driver.navigate().back();
		driver.navigate().forward();
		driver.quit();

	}

}
