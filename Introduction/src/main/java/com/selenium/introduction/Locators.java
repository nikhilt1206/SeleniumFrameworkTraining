package com.selenium.introduction;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
//		WebDriver driver = new ChromeDriver();
//		//We will get an error because of the synchronization issue 
//		//To fix it we have to use - implicit wait
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		String password = getPassword(driver);
//		driver.get("https://rahulshettyacademy.com/locatorspractice/");
//		driver.findElement(By.id("inputUsername")).sendKeys("Nikhil");
//		driver.findElement(By.name("inputPassword")).sendKeys(password);
//		
//		//In UI submit Button HTML - <button class="submit signInBtn" type="submit">Sign In</button>
//		//Here we see class="submit signInBtn", submit and signInBtn both are different classes so
//		//to get the web element (submit) - we can use either one of them to locate.
//		driver.findElement(By.className("signInBtn")).click();
		
		//using CSS selector locator to find and print the error message in the UI
//		//System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
//		
//		//link text locator - the element must have anchor <a> tag
//		driver.findElement(By.linkText("Forgot your password?")).click();
//		
//		//xpath creation for name text field
//		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Nikhil");
//		//xpath creating using indexing (use when we have less attributes with same value)
//		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("nikhilt1206@gmail.com");
//		Thread.sleep(2000);
//		//to clear the input field
//		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
//		//CSS style indexing
//		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("sowji10@gmail.com");
//		
//		//Locating element using parent to child tags
//		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9454730443");
//		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();  
//		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
//		
//		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
//		Thread.sleep(1000);
//		
//		driver.get("https://rahulshettyacademy.com/locatorspractice/");
//		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Rahul");
//		//Locate using Regular expressions - css
//		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
//		driver.findElement(By.id("chkboxOne")).click();
//		//Locate using Regular expressions - xpath
//		driver.findElement(By.xpath("//Button[contains(@class,'submit')]")).click();
		  WebDriver driver = new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		    String password = getPassword(driver);

		    driver.get("https://rahulshettyacademy.com/locatorspractice/");

		    driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
		    driver.findElement(By.name("inputPassword")).sendKeys(password);
		    driver.findElement(By.className("signInBtn")).click();

		    System.out.println(driver.findElement(By.cssSelector("p")).getText());

		    driver.quit();
		
	}
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();  
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		String[] passwordArray = passwordText.split("'");
		String password = passwordArray[1].split("'")[0];
		return password;
	}

}
