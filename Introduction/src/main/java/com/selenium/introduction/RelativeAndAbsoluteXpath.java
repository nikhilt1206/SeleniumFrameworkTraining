package com.selenium.introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class RelativeAndAbsoluteXpath {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Absolute Xpath - Root of DOM to the required web element
		//driver.findElement(By.xpath("/html/body/header/div/a/button[1]")).click();
		
		//Relative Xpath - directly goes to the required web element
		String messageText = driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText();
		System.out.println(messageText);
		
		//child to parent xpath navigation
		//header/div/button[1]/parent::div (only possible in xpath not css)
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText()); 
		
		
		driver.quit();

	}

}
