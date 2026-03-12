package com.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice14GetCssValue {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://adactinhotelapp.com/");
        driver.manage().window().maximize();

        WebElement loginBtn = driver.findElement(By.id("login"));
        String a = loginBtn.getCssValue("font-size");
        System.out.println("font-size: "+a);
        String b = loginBtn.getCssValue("color");
        System.out.println("Color: "+b);
        String c = loginBtn.getCssValue("font-weight");
        System.out.println("font-weight: "+c);
        String d = loginBtn.getCssValue("font-family");
        System.out.println("font-family: "+d);
        String e = loginBtn.getCssValue("background");
        System.out.println("Background: "+e);

        driver.quit();
    }
}
