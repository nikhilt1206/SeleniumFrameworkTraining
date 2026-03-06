package com.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice9isEnabled {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		boolean textField = driver.findElement(By.xpath("//input[@name='email']")).isEnabled();
		
		if(textField==true) {
			System.out.println("Text box is enabled");
		}
		else {
			System.out.println("Not enabled");
		}
		Thread.sleep(2000);
		driver.quit();
		
	}

}
