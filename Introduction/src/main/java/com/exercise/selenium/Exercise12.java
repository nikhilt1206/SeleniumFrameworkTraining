package com.exercise.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.SQLOutput;

public class Exercise12 {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().window().maximize();

        WebElement nameField = driver.findElement(By.name("name"));
        nameField.sendKeys("Nikhil Tiwari");

        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys("mummabachha1206@gmail.com");

        WebElement passwordField = driver.findElement(By.id("exampleInputPassword1"));
        passwordField.sendKeys("Mummabachha@1206");

        WebElement checkBox = driver.findElement(By.xpath("//input[@id='exampleCheck1']"));
        checkBox.click();

        WebElement dropDown = driver.findElement(By.id("exampleFormControlSelect1"));
        Select select = new Select(dropDown);
        select.selectByVisibleText("Male");

        WebElement radioButton =  driver.findElement(By.id("inlineRadio2"));
        radioButton.click();

        WebElement dateField = driver.findElement(By.name("bday"));
        dateField.sendKeys("22-03-2026");

        WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
        submitButton.click();

        WebElement successMsg = driver.findElement(By.cssSelector(".alert-success"));
        String text = successMsg.getText();
        System.out.println(text);
        System.out.println("Automation is successful");

    }
}
