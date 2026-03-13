package com.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice16Checkbox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();

        WebElement checkBox = driver.findElement(By.id("hobbies-checkbox-3"));
        WebElement label = driver.findElement(By.xpath("//label[text()='Music']"));
        System.out.println("Before clicking : "+checkBox.isSelected());
        checkBox.click();
        System.out.println("After clicking : "+checkBox.isSelected());
        Thread.sleep(5000);
        driver.quit();
    }
}
