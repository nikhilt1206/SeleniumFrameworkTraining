package com.exercise.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		String s = driver.getCurrentUrl();
		
		driver.findElement(By.id("username")).sendKeys("nikhilt1206");
		driver.findElement(By.id("password")).sendKeys("Organic30");
		//driver.findElement(By.id("login")).click();
		
		if(s.equals("https://adactinhotelapp.com/index.php")) {
			System.out.println("You are in adactin login page.");
		}
		else {
			System.out.println("You are in the logged user page.");
		}
		Thread.sleep(1000);
		driver.quit();
		

	}

}
