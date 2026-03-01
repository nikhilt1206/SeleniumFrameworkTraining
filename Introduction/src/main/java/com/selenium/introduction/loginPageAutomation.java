package com.selenium.introduction;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
public class loginPageAutomation {

	public static void main(String[] args) throws InterruptedException {
		
		String name ="Rahul";
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);
		//Locate using Regular expressions - css
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		//Locate using Regular expressions - xpath
		driver.findElement(By.xpath("//Button[contains(@class,'submit')]")).click();
		//System.out.println(driver.findElement(By.cssSelector(".login-container p")).getText());
		//Assert.assertEquals(driver.findElement(By.cssSelector(".login-container p")).getText(), "You are successfully logged in.");
		
		//Explicit waits 
		String message = wait.until(
		ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".login-container p"))).getText();
		System.out.println(message);
		//to compare message 
		Assert.assertEquals(message, "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
