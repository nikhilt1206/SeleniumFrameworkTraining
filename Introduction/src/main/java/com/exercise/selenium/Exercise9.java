package com.exercise.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Exercise9 {

	public static void main(String[] args) {

	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("identifierId")).sendKeys("nikhilt1206");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement nextBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Next']/parent::button")));
		nextBtn.click();
		
		WebElement pwd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("passwd")));
		pwd.sendKeys("Nikhil@12");
		
		WebElement nextBtn1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Next']/parent::button")));
		nextBtn.click();
		
		driver.quit();
		

	}

}
