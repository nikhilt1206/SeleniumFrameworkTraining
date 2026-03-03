package com.practice.selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Practice2 {

	public static void main(String[] args) throws InterruptedException {

		//To open the browser
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(2000); //To make browser wait
		
		//To delete cookies
		driver.manage().deleteAllCookies();
		
		//To set the size of the window
		Dimension d = new Dimension(500,500);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		
		//To set the position of the window
		Point p = new Point(250,250);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		
		//To maximize the window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.close();

	}

}
