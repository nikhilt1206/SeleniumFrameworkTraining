package com.selenium.introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;

public class HandlingCalendarUI1 {
    public static void main(String[] args){

        ChromeOptions options = new ChromeOptions();

        HashMap<String, Object> prefs = new HashMap<>();
        prefs.put("profile.default_content_setting_values.notifications", 2);

        options.setExperimentalOption("prefs", prefs);
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.easemytrip.com/");
        driver.manage().window().maximize();

        WebElement roundTrip = driver.findElement(By.id("rtrip"));
        roundTrip.click();
        //WebElement oneWay = driver.findElement(By.id("oway"));
        //oneWay.click();

        //WebElement returnDate = driver.findElement(By.id("rdate"));
        //One way to validate -
//        if(returnDate.isDisplayed()){
//            System.out.println("Date is Enabled ✅");
//        }
//        else{
//            System.out.println("Date is disabled ❌");
//        }
        //2nd way to validate
//        WebElement returnBlock = driver.findElement(By.id("rdatelbl"));
//        String classValue = returnBlock.getAttribute("class");
//        if(classValue.contains("op")){
//            System.out.println("Return date is disabled ❌");
//        }
//        else{
//            System.out.println("Return date is enabled ✅");
//        }

        //3rd way using visibility
        WebElement msg = driver.findElement(By.id("rtag"));
        if(msg.isDisplayed()){
            System.out.println("Return date is disabled ❌");
        }
        else{
            System.out.println("Return date is enabled ✅");
        }
    }
}
