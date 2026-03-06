package com.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice8isDisplayed {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		boolean logo = driver.findElement(By.xpath("//*[name()='svg' and @viewBox='0 0 24 24']")).isDisplayed();
		if(logo==true) {
			System.out.println("logo is available.");
		}
		else {
			System.out.println("logo is not available.");
		}
		Thread.sleep(1500);
		driver.close();

	}

}
