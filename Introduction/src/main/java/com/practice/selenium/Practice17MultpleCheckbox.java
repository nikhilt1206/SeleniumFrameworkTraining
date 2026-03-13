package com.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Practice17MultpleCheckbox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();

        List<WebElement> checkBoxList = driver.findElements(By.xpath("//label[contains(@for,'hobbies-checkbox')]"));
        for(WebElement x:checkBoxList){
            x.click();
        }
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for(WebElement x: checkBoxes){
            System.out.println(x.isSelected());
        }
        Thread.sleep(2500);
        driver.quit();
    }
}
