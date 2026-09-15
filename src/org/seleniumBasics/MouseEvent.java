package org.seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

public class MouseEvent {
    public static void main(String[] args) throws AWTException, InterruptedException {
        /* mouse event: click(),doubleClick(),contextClick(),moveToElement(),clickAndHold(),release(),dragandDrop()*/
        // Pre-defined class called - Actions [Selenium]
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
//        WebElement doubleClickLabel = driver.findElement(By.xpath("//h2[text()='Double Click']"));
//
        Actions act = new Actions(driver);
//
//        act.scrollToElement(doubleClickLabel).perform();
//
//        WebElement pointMe = driver.findElement(By.xpath("//button[text()='Point Me']"));
//        act.moveToElement(pointMe).perform();
//
//        WebElement dragandDrop = driver.findElement(By.xpath("//h2[text()='Drag and Drop']"));
//        act.scrollToElement(dragandDrop).perform();
//
//        WebElement copytext = driver.findElement(By.xpath("//button[text()='Copy Text']"));
//        act.doubleClick(copytext).perform();
//
//        WebElement draggable = driver.findElement(By.id("draggable"));
//        WebElement droppable = driver.findElement(By.id("droppable"));
//
//        //act.clickAndHold(draggable).moveToElement(droppable).release().build().perform();
//        act.dragAndDrop(draggable,droppable).perform();
//
//        WebElement slider = driver.findElement(By.xpath("//*[text()='Slider']"));
//        act.scrollToElement(slider).perform();

        WebElement udemyCourses = driver.findElement(By.linkText("Udemy Courses"));
        act.scrollToElement(udemyCourses).perform();
        act.contextClick(udemyCourses).perform();
        //Keyboard event [Java-AWT ---> Robot]
        Robot rob = new Robot();
//        rob.keyPress(KeyEvent.VK_DOWN);
//        rob.keyPress(KeyEvent.VK_DOWN);

//        rob.keyPress(KeyEvent.VK_ENTER);
//        rob.keyPress(KeyEvent.VK_ENTER);

//        //window Handle
//        String parentWindow = driver.getWindowHandle();
//        System.out.println("parentWindow: "+parentWindow);
//        int count = 1;
//        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//        Set<String> windowHandles = driver.getWindowHandles();
//        for(String window:windowHandles){
//            System.out.println(count+". "+window);
//            count++;
//        }
//wait mechanism - implicit and explicit wait[Duration and condition]
        /*
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSecond(10));
        wait.until(ExpectedConditions.selecttheConditionListedOut);

         */

        driver.navigate().to("https://letcode.in/window");
        String ParentId = driver.getWindowHandle();
        System.out.println("Parent ID: "+ParentId);

        driver.findElement(By.id("multi")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
        int count = 1;
        Set<String> windowHandles = driver.getWindowHandles();
        for(String window:windowHandles){
            System.out.println(count+". "+window);
            if(ParentId.equals(window)) {
                driver.switchTo().window(window);
                System.out.println(driver.getTitle());
                driver.close();
            }
            count++;
        }

    }


}
