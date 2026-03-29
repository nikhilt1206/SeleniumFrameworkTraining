package com.exercise.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise15iframeHandling {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[.='Nested Frames']")).click();
        System.out.println(driver.findElements(By.tagName("frame")).size());

        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
        System.out.println(driver.findElement(By.tagName("body")).getText());

        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
        System.out.println(driver.findElement(By.id("content")).getText());

        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-right");
        System.out.println(driver.findElement(By.tagName("body")).getText());

        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame-bottom");
        System.out.println(driver.findElement(By.tagName("body")).getText());

        //WebElement middleFrameText = driver.findElement(By.id("content"));
        //System.out.println(middleFrameText.getText());

    }
}

