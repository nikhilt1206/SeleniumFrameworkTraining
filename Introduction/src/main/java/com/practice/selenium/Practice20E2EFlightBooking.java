package com.practice.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Practice20E2EFlightBooking {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //By default it is One way
        /*WebElement roundTrip = driver.findElement(By.xpath("//div[normalize-space()='one way']"));
        roundTrip.click();*/

        WebElement fromContainer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[normalize-space()='From']")));
        fromContainer.click();
        WebElement selectFrom = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Bengaluru']")));
        selectFrom.click();
        WebElement selectTo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Varanasi']")));
        selectTo.click();
        WebElement departDate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-testid='undefined-calendar-day-28']")));
        departDate.click();
        WebElement passengers =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Passengers']")));
        passengers.click();
        for(int i=1;i<2;i++){
            WebElement selectPassengerNumber = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")));
            selectPassengerNumber.click();
        }
        WebElement doneBtn = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//div[@data-testid='home-page-travellers-done-cta']")
                )
        );
        doneBtn.click();
        wait.until(ExpectedConditions.invisibilityOf(doneBtn));

        By familyLocator = By.xpath("//div[text()='Family & Friends']");

        WebElement family = wait.until(
                ExpectedConditions.visibilityOfElementLocated(familyLocator)
        );
        Actions actions = new Actions(driver);
        actions.moveToElement(family).click().perform();
        WebElement searchBtn = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//div[@data-testid='home-page-flight-cta']")
                )
        );
        searchBtn.click();
    }
}
