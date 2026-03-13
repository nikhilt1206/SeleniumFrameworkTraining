package com.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Practice18ToPrintSelectedCheckboxValues {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        // Locate all hobby labels
        List<WebElement> labels =
                driver.findElements(By.xpath("//label[contains(@for,'hobbies-checkbox')]"));
        // Select Sports and Music
        for(WebElement label : labels){
            String text = label.getText().trim();
            if(text.equalsIgnoreCase("Sports") || text.equalsIgnoreCase("Music")){
                label.click();
            }
        }
        System.out.println("Selected Checkboxes:");
        // Verify and print selected checkboxes
        for(WebElement label : labels){
            String checkboxId = label.getAttribute("for");
            WebElement checkbox = driver.findElement(By.id(checkboxId));
            if(checkbox.isSelected()){
                System.out.println(label.getText());
            }
        }
        Thread.sleep(2000);
        driver.quit();
    }
}