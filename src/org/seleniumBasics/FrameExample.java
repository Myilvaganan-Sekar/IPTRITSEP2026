package org.seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/frame");

        driver.switchTo().frame("firstFr");
        driver.findElement(By.name("fname")).sendKeys("AutomationTester");
        driver.findElement(By.name("lname")).sendKeys("QE");

        driver.switchTo().frame(0);
        driver.findElement(By.name("email")).sendKeys("QE@gmail.com");

//        driver.switchTo().parentFrame();
//        driver.switchTo().parentFrame();
        //main webpage

        driver.switchTo().defaultContent();






    }
}
