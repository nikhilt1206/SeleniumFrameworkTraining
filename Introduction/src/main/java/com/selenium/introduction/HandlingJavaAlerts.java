package com.selenium.introduction;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandlingJavaAlerts {
    public static void main(String[] args) {
        String text = "Nikhil";

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement alertTextField = driver.findElement(By.id("name"));
        alertTextField.sendKeys(text);
        WebElement alertBtn = driver.findElement(By.id("alertbtn"));
        alertBtn.click();
        //To get the text present on the alert
        //System.out.println(driver.switchTo().alert().getText());
        //To switch context from browser to alerts
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        System.out.println(alert.getText());
        alert.accept();

        //Another kind of alert having positive and negative fields
        WebElement cnfBtn = driver.findElement(By.id("confirmbtn"));
        cnfBtn.click();
        Alert alert2 = wait.until(ExpectedConditions.alertIsPresent());
        //System.out.println(driver.switchTo().alert().getText());
        System.out.println(alert2.getText());
        alert2.dismiss();
    }
}
