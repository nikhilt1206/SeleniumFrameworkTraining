package com.practice.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice11PrintingRadioBtnNames {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://qa-automation-practice.netlify.app/radiobuttons.html");
		driver.manage().window().maximize();
		
		List<WebElement> radioBtns = driver.findElements(By.xpath("//input[@type='radio']"));
		for(WebElement rbtn:radioBtns) {
			System.out.println(rbtn.getAttribute("id"));
		}
		Thread.sleep(1000);
		driver.quit();

	}

}
