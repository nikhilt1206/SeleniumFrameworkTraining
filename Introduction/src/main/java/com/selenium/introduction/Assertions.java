package com.selenium.introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertions {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();

        //Assert.assertFalse - Expects false condition
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        //System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());-False
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        //System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());-True
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        //count the number of checkboxes
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000L);
        for(int i=1;i<5;i++){
            driver.findElement(By.id("hrefIncAdt")).click(); //4 times + button will be clicked
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        //Assert.assertEquals - compares 2 arguments
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult");
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
    }
}
