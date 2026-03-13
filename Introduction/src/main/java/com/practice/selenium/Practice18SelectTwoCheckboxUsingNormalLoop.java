package com.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Practice18SelectTwoCheckboxUsingNormalLoop {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();

        List<WebElement> checkBoxes = driver.findElements(By.xpath("//label[contains(@for,'hobbies-checkbox')]"));
        for(int i=0;i<checkBoxes.size();i++){
            if(checkBoxes.get(i).getText().equals("Sports")||checkBoxes.get(i).getText().equals("Music")){
                checkBoxes.get(i).click();
            }
        }
        Thread.sleep(2000);
        driver.quit();
    }
}
