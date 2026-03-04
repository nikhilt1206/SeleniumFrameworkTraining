package com.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice5LinkText {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.linkText("Forgot Password?"));
		element.click();
		
		Thread.sleep(2000);
		driver.quit();
		

	}

}
