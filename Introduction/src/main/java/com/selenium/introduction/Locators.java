package com.selenium.introduction;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
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
		
		//link text locator - the element must have anchor <a> tag
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//xpath creation for name text field
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Nikhil");
		//xpath creating using indexing (use when we have less attributes with same value)
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("nikhilt1206@gmail.com");
		Thread.sleep(2000);
		//to clear the input field
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		//CSS style indexing
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("sowji10@gmail.com");
		
		//Locating element using parent to child tags
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9454730443");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();  
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
	}

}
