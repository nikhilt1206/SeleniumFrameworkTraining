package com.selenium.introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.sql.SQLOutput;
import java.util.List;

public class HandlingCalendarUI2 {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.manage().window().maximize();

        String monthNumber="6";
        String date="15";
        String year="2027";
        List<String> expectedDate = List.of(monthNumber,date,year);
        int monthIndex=Integer.parseInt(monthNumber)-1;
        driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
        driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
        driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
        driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
        driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(monthIndex).click();
        driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
        //System.out.println(driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).getText());
        List<WebElement> datePicked =  driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
        for(int i=0;i<datePicked.size();i++){
            String actual = datePicked.get(i).getAttribute("value");
            String expected = expectedDate.get(i);
            Assert.assertEquals(actual,expected,"Mismatch at index "+i+" | Expected: "+expected +" | Actual: "+actual);
        }
        System.out.println("✅ Date matched successfully");
        //driver.close();
    }
}
