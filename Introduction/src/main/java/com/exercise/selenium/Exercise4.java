package com.exercise.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Need to learn first then i will back to this exercise
public class Exercise4 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		// Click create account
		wait.until(ExpectedConditions.elementToBeClickable(
		        By.xpath("//a[contains(text(),'Create new account')]"))).click();

		// Wait until first name field appears
		wait.until(ExpectedConditions.visibilityOfElementLocated(
		        By.name("firstname"))).sendKeys("Nikhil");
		
		
		Thread.sleep(2000);
		driver.quit();

	}

}
