package com.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Practice17MultpleCheckboxUsingNormalLoop {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();

        List<WebElement> checkBoxList = driver.findElements(By.xpath("//label[contains(@for,'hobbies-checkbox')]"));
        for(int i=0;i<checkBoxList.size();i++){
            checkBoxList.get(i).click();
        }
        Thread.sleep(2500);
        driver.quit();
    }
}
