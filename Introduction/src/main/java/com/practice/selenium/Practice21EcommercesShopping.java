package com.practice.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.SQLOutput;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class Practice21EcommercesShopping {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("rahulshettyacademy");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Learning@830$3mK2");
        WebElement userRadioBtn = driver.findElement(By.cssSelector("input[name='radio'][value='user']"));
        userRadioBtn.click();
        WebElement okayBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("okayBtn")));
        okayBtn.click();
        WebElement selectDropdown = driver.findElement(By.cssSelector("select.form-control"));
        Select select = new Select(selectDropdown);
        select.selectByVisibleText("Consultant");
        WebElement acceptTerms = driver.findElement(By.id("terms"));
        acceptTerms.click();
        WebElement signInBtn = driver.findElement(By.id("signInBtn"));
        signInBtn.click();

        //add the items in the cart
        String[] itemsNeeded = {"iphone X","Samsung Note 8","Nokia Edge","Blackberry"};
        int countOfItemsNeeded=0;
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//h4[contains(@class,'card-title')]")
        ));
        List<WebElement> products = driver.findElements(By.xpath("//h4[contains(@class,'card-title')]"));
        for(int i=0;i< products.size();i++){
            String name = products.get(i).getText();
            List<String> itemNeededList = Arrays.asList(itemsNeeded);
            if(itemNeededList.contains(name)){
                driver.findElements(By.xpath("//button[contains(.,'Add')]")).get(i).click();
                countOfItemsNeeded++;
                if(countOfItemsNeeded==itemsNeeded.length){
                    break;
                }
            }
        }
        WebElement checkOutBtn = driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']"));
        checkOutBtn.click();
        WebElement finalCheckout = driver.findElement(By.xpath("//button[contains(.,'Checkout')]"));
        finalCheckout.click();
        System.out.println("Items added");
    }
}
