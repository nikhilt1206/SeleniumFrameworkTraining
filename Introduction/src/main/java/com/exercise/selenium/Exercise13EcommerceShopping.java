package com.exercise.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.Arrays;
import java.util.List;

public class Exercise13EcommerceShopping {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        driver.manage().window().maximize();
        String[] itemsNeeded = {"Cucumber","Brocolli","Beetroot","Carrot"};
        int countOfItemsNeeded=0;
        List <WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        for(int i=0;i<products.size();i++){
            String[] name = products.get(i).getText().split("-");
            String fomattedList = name[0].trim();
            List<String> itemsNeededList = Arrays.asList(itemsNeeded);
            if(itemsNeededList.contains(fomattedList)){
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                countOfItemsNeeded++;
                if(countOfItemsNeeded==itemsNeeded.length){
                    break;
                }
            }
        }

    }
}
