package com.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Practice22CountLinksPresentInWebpage {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //count of links on a page
        int countLink = driver.findElements(By.tagName("a")).size();
        System.out.println(countLink);
        //count of links present in the footer section - create mini driver to limit it's scope to footer section
        WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
        System.out.println(footerDriver.findElements(By.tagName("a")).size());
        //links of only first column in footer section
        //WebElement firstFooterColumn = driver.findElement(By.tagName("ul"));
        //System.out.println(firstFooterColumn.findElements(By.tagName("a")).size());

        WebElement columnDriver = footerDriver.findElement(By.xpath(".//table/tbody/tr/td[1]/ul"));
        List<WebElement> links = columnDriver.findElements(By.tagName("a"));

        //click on each link in the column and check if they are working
        for(int i=1;i<links.size();i++){
            String clickOnLinkTab = Keys.chord(Keys.COMMAND,Keys.ENTER);
            links.get(i).sendKeys(clickOnLinkTab);
            wait.until(ExpectedConditions.numberOfWindowsToBe(i+1));
        }

        //get the title of child tabs
        Set<String> tabs = driver.getWindowHandles(); //4 tabs
        Iterator<String> it = tabs.iterator();
        while(it.hasNext()){
           driver.switchTo().window(it.next());
           System.out.println(driver.getTitle());
        }
    }
}
