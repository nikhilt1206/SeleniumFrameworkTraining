package com.selenium.introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class Synchronization {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //implicit wait
        //Explicit wait
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        String[] itemsNeeded = {"Cucumber","Brocolli","Beetroot","Carrot"};
        addItemsInCart(driver,itemsNeeded,wait);
    }
    public static void addItemsInCart(WebDriver driver, String[] itemsNeeded, WebDriverWait wait){

        int countOfItemsNeeded=0;
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
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
        WebElement goToCart = driver.findElement(By.cssSelector("img[alt='Cart']"));
        goToCart.click();
        WebElement checkoutBtn = driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']"));
        checkoutBtn.click();
        WebElement promoCodeField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter promo code']")));
        promoCodeField.sendKeys("rahulshettyacademy");
        WebElement applyBtn = driver.findElement(By.xpath("//button[text()='Apply']"));
        applyBtn.click();
        WebElement promoMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
        System.out.println(promoMsg.getText());
        WebElement placeOrderBtn = driver.findElement(By.xpath("//button[text()='Place Order']"));
        placeOrderBtn.click();
    }
}
