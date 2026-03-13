package com.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Practice18SelectTwoCheckbox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();

        List<WebElement> checkBoxes = driver.findElements(By.xpath("//label[contains(@for,'hobbies-checkbox')]"));
        for(WebElement x : checkBoxes){
            if(x.getText().equals("Sports")||x.getText().equals("Music")){
                x.click();
            }
        }
        Thread.sleep(2000);
        driver.quit();
    }
}
