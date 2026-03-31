package com.selenium.introduction;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class TakeAScreenshot {
    public static void main(String[] args) throws IOException {
        //to take screenshot we need to convert web driver object to screenshot object
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //casting driver object to take the screenshot
        driver.get("https://google.com");
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File(System.getProperty("user.dir") + "/screenshots/screenshot.png"));
    }
}
