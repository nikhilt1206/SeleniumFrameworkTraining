package com.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Practice18ToSelectUnselectedCheckbox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();

        List<WebElement> labels = driver.findElements(By.xpath("//label[contains(@for,'hobbies-checkbox')]"));
        for(WebElement label : labels){
            String text = label.getText();
            String checkboxId = label.getAttribute("for");
            WebElement checkbox = driver.findElement(By.id(checkboxId));
            if(text.equals("Sports")||text.equals("Music")){
                label.click();
            }
            if(!checkbox.isSelected()){
                label.click();
            }
        }
        Thread.sleep(3000);
        driver.quit();
    }
}
