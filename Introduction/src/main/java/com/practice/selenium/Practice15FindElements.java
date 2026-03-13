package com.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Practice15FindElements {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();

        List<WebElement> listWebElements = driver.findElements(By.tagName("a"));
        System.out.println("Count of all the links present : "+listWebElements.size());

        for(WebElement  x : listWebElements){
            System.out.println("List of all Web Elements present : "+ x.getAttribute("href"));
        }
        driver.quit();
    }
}
