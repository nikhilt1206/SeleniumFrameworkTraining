package com.selenium.introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;

public class HandlingCalanderUI {
    public static void main(String[] args){

        ChromeOptions options = new ChromeOptions();

        HashMap<String, Object> prefs = new HashMap<>();
        prefs.put("profile.default_content_setting_values.notifications", 2);

        options.setExperimentalOption("prefs", prefs);
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.easemytrip.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("ddate")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement activeDate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(@id,'19/03/2026')]")));
        activeDate.click();
        String classes = activeDate.getAttribute("class");
        if(classes.contains("active-date")) {
            System.out.println("Date is selected ✅");
        } else {
            System.out.println("Date NOT selected ❌");
        }
    }
}
