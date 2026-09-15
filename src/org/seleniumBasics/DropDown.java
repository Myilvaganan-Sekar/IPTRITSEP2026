package org.seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement country = driver.findElement(By.id("country"));

        Select sel = new Select(country);
        boolean multiple = sel.isMultiple();
        System.out.println("is multiple:"+multiple);

        List<WebElement> options = sel.getOptions();
        for(WebElement option:options){
            System.out.println(option.getText());
        }

        sel.selectByIndex(9);
        sel.selectByVisibleText("France");
        sel.selectByValue("china");

        WebElement multiple1 = driver.findElement(By.id("colors"));

        Select selMul = new Select(multiple1);
        System.out.println(selMul.isMultiple());

        selMul.selectByIndex(2);
        selMul.selectByValue("white");
        selMul.selectByVisibleText("Red");

        selMul.deselectByIndex(2);

        selMul.deselectAll();
    }
}
