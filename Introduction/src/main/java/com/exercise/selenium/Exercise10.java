package com.exercise.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Exercise10 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement fwdLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Forgotten password?']/ancestor::a")));
		fwdLink.click();
		
		WebElement enterEmail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Mobile number or email address']/preceding-sibling::input")));
		enterEmail.sendKeys("nikhilt1206@gmail.com");
		
		driver.quit();
	}

}
