package com.selenium.introduction;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HandleSSLCertifications {
    public static void main(String[] args){
        /*In Selenium, we use ChromeOptions class to customize browser behavior.
        We can bypass SSL certificate errors using setAcceptInsecureCerts(true).
        Additionally, ChromeOptions can be used to configure proxy settings,
        download directories, and browser preferences.*/
        //to set the browser behaviour - this will bypass ssl certificate error
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setAcceptInsecureCerts(true);

        //to add extensions/plugins in web driver // to set the proxy setting in the browser
        //Proxy is generally used in corporate environments for network routing or security testing
        Proxy proxy = new Proxy();
        proxy.setHttpProxy("ipaddress:4444");
        //chromeOptions.setCapability("proxy",proxy);
        chromeOptions.setProxy(proxy);
        //set download directory
        Map<String,Object> prefs = new HashMap<String,Object>();
        prefs.put("download.default_directory","/directory/path");
        chromeOptions.setExperimentalOption("prefs",prefs);
        //to block automatic popups
        chromeOptions.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://expired.badssl.com/");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
    }
}
