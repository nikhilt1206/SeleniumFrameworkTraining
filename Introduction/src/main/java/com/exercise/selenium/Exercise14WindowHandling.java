    package com.exercise.selenium;

    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;

    import java.util.Iterator;
    import java.util.Set;

    public class Exercise14WindowHandling {
        public static void main(String[] args){
            WebDriver driver = new ChromeDriver();
            driver.get("https://the-internet.herokuapp.com/");
            driver.manage().window().maximize();

            driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
            driver.findElement(By.xpath("//a[.='Click Here']")).click();
            //PARENT AND CHILD WINDOW
            Set<String> windows = driver.getWindowHandles();
            Iterator<String> it = windows.iterator();
            String parentId=it.next();
            String childId=it.next();
            driver.switchTo().window(childId);
            String textInChildWindow = driver.findElement(By.xpath("//h3[.='New Window']")).getText();
            System.out.println(textInChildWindow);
            driver.switchTo().window(parentId);
            String textInParentWindow = driver.findElement(By.xpath("//h3[.='Opening a new window']")).getText();
            System.out.println(textInParentWindow);
        }
    }
