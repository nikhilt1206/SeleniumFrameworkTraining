package com.selenium.introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class ScrollingOperationUsingJavaScriptExecutor {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".tableFixHead")));
        //Selenium won't provide any method to do scrolling operation so using Javascript executor class we can achieve it
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //scroll page
        js.executeScript("window.scrollBy(0,900)");
        //scroll inside table
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");

        List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
        int sum=0;
        for(WebElement value:values){
            //String text = value.getText();
            //int num = Integer.parseInt(text);
            //sum = sum+num;
            sum+=Integer.parseInt(value.getText().trim());
        }
        System.out.println("Calculated sum: "+sum);

        int totalInUI = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
        System.out.println("UI sum: "+totalInUI);
        Assert.assertEquals(sum,totalInUI,"Sum mismatch between calculated and UI value");
        System.out.println("✅ Validation Passed");
        driver.close();
    }
}
