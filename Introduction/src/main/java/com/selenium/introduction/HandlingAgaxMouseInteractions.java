package com.selenium.introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;

public class HandlingAgaxMouseInteractions {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions a = new Actions(driver);
        //this will move the mouse to the account and list options
        //WebElement accountListOption = wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-link-accountList")));
        //a.moveToElement(accountListOption).build().perform();
        //move to search box, click it, write in capital letters, build it and executes it
        //a.moveToElement(driver.findElement(By.id("twotabsearchtextbox")))
        //        .click()
        //        .keyDown(Keys.SHIFT).sendKeys("facewash").build().perform();
        //to select the entire passed keyword - double click
//        a.moveToElement(driver.findElement(By.id("twotabsearchtextbox")))
//                .click()
//                .keyDown(Keys.SHIFT).sendKeys("facewash").doubleClick().build().perform();
        //to do right-click on a specific element
        WebElement accountListOption = wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-link-accountList")));
        a.moveToElement(accountListOption).contextClick().build().perform();
    }
}
