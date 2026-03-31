package com.selenium.introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindowAndDeleteCookies {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        //to maximize browser window
        driver.manage().window().maximize();
        //to delete all the cookies
        driver.manage().deleteAllCookies();
        //delete only one cookie
        driver.manage().deleteCookieNamed("cookieName");
        //Scenario - Delete the session and validate if the secure login is logged out and it will go to login page
        //Delete that particular cookie and then click on any link in the browser

        driver.get("https://google.com");
    }
}
