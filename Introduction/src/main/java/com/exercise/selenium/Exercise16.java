package com.exercise.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Exercise16 {
    public static void main(String[] args){
        //Select any checkbox
        //Grab the label of the selected checkbox (no hardcoding) //put into variable
        //Select an option in dropdown. Here option to select should come from step 2
        //enter step grabbed label text in edit box
        //click on alert and validate if text present in the alert comes from step 2
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement checkBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkBoxOption1")));
        checkBox.click();
        //get label text
        String text = driver.findElement(
                By.xpath("//label[input[@id='checkBoxOption1']]")
        ).getText();
        System.out.println(text);
        WebElement dropDown = driver.findElement(By.id("dropdown-class-example"));
        Select select = new Select(dropDown);
        select.selectByVisibleText(text);
        WebElement inputBox = driver.findElement(By.id("name"));
        inputBox.sendKeys(text);
        driver.findElement(By.id("alertbtn")).click();
        String alertText = driver.switchTo().alert().getText();
        System.out.println(alertText);
        if(alertText.contains(text)){
            System.out.println("✅ Passed");
        }
        else {
                System.out.println("❌ Failed");
             }
        driver.switchTo().alert().accept();
    }
}
