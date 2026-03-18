package com.exercise.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Exercise11 {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        //click on the first checkbox and verify if it is clicked
        driver.findElement(By.id("checkBoxOption1")).click();
        Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
        //click on the first checkbox again and verify it is unchecked
        driver.findElement(By.id("checkBoxOption1")).click();
        Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());

        //Count the total number of checkboxes present in the page
        int count = driver.findElements(By.cssSelector("input[type='checkbox']")).size();
        System.out.println(count);



    }
}
