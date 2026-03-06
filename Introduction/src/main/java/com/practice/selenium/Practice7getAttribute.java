package com.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice7getAttribute {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("nikhilt1206");
		driver.findElement(By.id("password")).sendKeys("Organic30");
		
		String a = driver.findElement(By.id("username")).getAttribute("value");
		String b = driver.findElement(By.id("password")).getAttribute("value");
		System.out.println(a);
		System.out.println(b);
		
		Thread.sleep(2000);
		driver.quit();
	}

}
 	