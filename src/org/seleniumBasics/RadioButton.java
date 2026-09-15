package org.seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement maleRadioButton = driver.findElement(By.id("male"));
        boolean selected = maleRadioButton.isSelected();
        System.out.println("selected: "+selected);
        maleRadioButton.click();
        boolean afterClick = maleRadioButton.isSelected();
        System.out.println("afterClick: "+afterClick);

        String attributeValue = maleRadioButton.getAttribute("class");
        System.out.println("attributeValue: "+attributeValue);

        String tagName = maleRadioButton.getTagName();
        System.out.println("tagName: "+tagName);

        driver.findElement(By.id("alertBtn")).click();
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        System.out.println("Simple Alert: "+text);
        Thread.sleep(3000);
        alert.accept();

        driver.findElement(By.id("promptBtn")).click();

        Alert alert1 = driver.switchTo().alert();
        System.out.println(alert1.getText());
        alert1.sendKeys("Selenuiumautomation");
        alert1.accept();

        driver.close();


    }
}
