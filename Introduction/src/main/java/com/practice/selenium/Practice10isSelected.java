package com.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice10isSelected {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://qa-automation-practice.netlify.app/radiobuttons.html");
		driver.manage().window().maximize();
		
		WebElement radioBtn = driver.findElement(By.xpath("//input[@id='radio-button2']"));
		radioBtn.click();
		
		if(radioBtn.isSelected()) {
			System.out.println("Radio button is selected.");
		}
		else {
			System.out.println("Radio button is not selected.");
		}
		
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
