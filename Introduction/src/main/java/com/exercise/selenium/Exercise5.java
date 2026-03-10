package com.exercise.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise5 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		boolean logo = driver.findElement(By.xpath("//*[local-name()='svg' and @viewBox='0 0 24 24']")).isDisplayed();
		if(logo) {
			System.out.println("Logo is available");
		}
		else {
			System.out.println("Logo is not available");
		}
		Thread.sleep(1500);
		driver.quit();

	}

}
