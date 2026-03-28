package com.selenium.introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iFramesHandling {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        System.out.println(driver.findElement(By.tagName("iframe")).getSize());
        System.out.println(driver.findElements(By.tagName("iframe")).size());
        //this will switch the frames, and now we can do drag and drop using actions class
        //driver.switchTo().frame(0);
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
        driver.findElement(By.id("draggable")).click();
        Actions actions = new Actions(driver);
        //to do drag and drop we need source and target
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        actions.dragAndDrop(source,target).build().perform();
        //once after performing the action, user needs to come out of the frame component
        driver.switchTo().defaultContent();
    }
}
