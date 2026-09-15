package org.seleniumBasics;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class ScreenShots {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/?zx=1787549649567");

        //DownCasting
        TakesScreenshot ts = (TakesScreenshot) driver;
//        File source = ts.getScreenshotAs(OutputType.FILE);
//        File dest = new File("./ScreenShots/googlepage.png");
//        FileHandler.copy(source,dest);


        FileHandler.copy(ts.getScreenshotAs(OutputType.FILE),new File("./ScreenShots/googlepage.png"));

        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        FileHandler.copy(ts.getScreenshotAs(OutputType.FILE),new File("./ScreenShots/testAutomation.png"));


    }
}
