package com.selenium.introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandles {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[contains(text(),'Free Access')]")).click();
        //this set will store parent and child window ID's
        Set<String> windows = driver.getWindowHandles();
        //this iterator will extract the id values present in the set collection
        Iterator<String> it = windows.iterator();
        String parentId = it.next();
        String childId = it.next();
        //To switch to child window
        driver.switchTo().window(childId);
        String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim()
                .split(" ")[0];
        driver.switchTo().window(parentId);
        driver.findElement(By.id("username")).sendKeys(emailId);
    }
}
