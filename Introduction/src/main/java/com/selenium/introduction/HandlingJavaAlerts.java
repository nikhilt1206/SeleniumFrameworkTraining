package com.selenium.introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingJavaAlerts {
    public static void main(String[] args){
        String text = "Nikhil";

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        WebElement alertTextField = driver.findElement(By.id("name"));
        alertTextField.sendKeys(text);
        WebElement alertBtn = driver.findElement(By.id("alertbtn"));
        alertBtn.click();
        //To get the text present on the alert
        System.out.println(driver.switchTo().alert().getText());
        //To switch context from browser to alerts
        driver.switchTo().alert().accept();

        //Another kind of alert having positive and negative fields
        WebElement cnfBtn = driver.findElement(By.id("confirmbtn"));
        cnfBtn.click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();
    }
}
