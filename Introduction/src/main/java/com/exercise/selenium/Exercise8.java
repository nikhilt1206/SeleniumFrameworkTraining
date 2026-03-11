package com.exercise.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Exercise8 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Gmail")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("Gmail"));
		
		String s = driver.getTitle();
		
		if(s.contains("Gmail")) {
			System.out.println("Title is Gmail. User is naviagted to the Gmail page.");
		}
		else {
			System.out.println("Invalid Title. User navigated to wrong page.");
		}
		driver.quit();
	}

}
