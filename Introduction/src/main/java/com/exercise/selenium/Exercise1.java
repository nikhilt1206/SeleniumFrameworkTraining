package com.exercise.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("nikhilt1206");
		driver.findElement(By.id("password")).sendKeys("Organic30");
		driver.findElement(By.id("login")).click();
		
		Thread.sleep(1500);
		driver.quit();
		
	}

}
