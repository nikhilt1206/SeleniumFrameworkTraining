package com.selenium.introduction;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locators {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//We will get an error because of the synchronization issue 
		//To fix it we have to use - implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Nikhil");
		driver.findElement(By.name("inputPassword")).sendKeys("nikhil1234");
		
		//In UI submit Button HTML - <button class="submit signInBtn" type="submit">Sign In</button>
		//Here we see class="submit signInBtn", submit and signInBtn both are different classes so
		//to get the web element (submit) - we can use either one of them to locate.
		driver.findElement(By.className("signInBtn")).click();
		
		//using CSS selector locator to find and print the error message in the UI
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		
	}

}
