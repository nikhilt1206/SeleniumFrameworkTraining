package com.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice4Login {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("nikhilt1206");
		
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("Organic30");
		
		WebElement action = driver.findElement(By.id("login"));
		action.click();
		Thread.sleep(3000);
		
		driver.close();

	}

}
