package com.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice12KeyBoardActions {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://adactinhotelapp.com/");
        driver.manage().window().maximize();

        //Below code will copy the username value from the username text field and paste it in password text field
        WebElement x = driver.findElement(By.id("username"));
                x.sendKeys("nikhilt1206");
        WebElement y = driver.findElement(By.id("password"));
              //Below code works in Windows
               /* x.sendKeys(Keys.CONTROL,"ac");
                y.sendKeys(Keys.CONTROL,"v");*/

        //This code is for Mac
        // Copy username
        x.sendKeys(Keys.COMMAND, "a");
        x.sendKeys(Keys.COMMAND, "c");

        // Paste into password
        y.sendKeys(Keys.COMMAND, "v");

        Thread.sleep(3000);
        driver.quit();
    }
}
