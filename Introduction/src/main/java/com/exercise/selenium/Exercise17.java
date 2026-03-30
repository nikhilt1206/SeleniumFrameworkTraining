package com.exercise.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Exercise17 {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        //print number of rows/columns present in the table and print data of second row
        WebElement productTable = driver.findElement(By.id("product"));
        int rows = productTable.findElements(By.xpath(".//tr")).size();
        int columns = productTable.findElements(By.xpath(".//tr[1]/th")).size();
        System.out.println("Total rows: "+rows);
        System.out.println("Total columns: "+ columns);

        String secondRowData = productTable.findElement(By.xpath(".//tr[3]")).getText();
        System.out.println("Data in second row: "+secondRowData);

    }
}
