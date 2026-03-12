package com.practice.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice13GetSizeAndLocation {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://adactinhotelapp.com/");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.id("username"));
        //To get the size of an element
        Dimension s = username.getSize();
        int height = s.getHeight();
        int width = s.getWidth();
        System.out.println("Height: "+height);
        System.out.println("Width: "+width);

        //To get the location of an element
        Point loc = username.getLocation();
        int x = loc.getX();
        int y = loc.getY();
        System.out.println("x-axis: "+x);
        System.out.println("y-axis: "+y);

        driver.quit();

    }
}
