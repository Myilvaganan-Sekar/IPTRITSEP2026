package org.seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class ElementInteraction {

    private static final Logger log = LoggerFactory.getLogger(ElementInteraction.class);

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        WebElement usernameField = driver.findElement(By.id("user-name"));
        boolean enabled = usernameField.isEnabled();
        if(enabled) {
            usernameField.sendKeys("standard_user");
        }
        WebElement passwordField = driver.findElement(By.id("password"));
        boolean enabled1 = passwordField.isEnabled();
        if(enabled1) {
            passwordField.sendKeys("secret_sauce");
        }
        WebElement loginButton = driver.findElement(By.id("login-button"));
        boolean displayed = loginButton.isDisplayed();
        boolean enabled2 = loginButton.isEnabled();
        if(displayed && enabled2) {
            loginButton.click();
        }
        String currentUrl = driver.getCurrentUrl();

        if(currentUrl.equalsIgnoreCase("https://www.saucedemo.com/inventory.html")){
            System.out.println("Login in successfully");
        }else{
            System.out.println("Login failed");
        }

        WebElement productLabel = driver.findElement(By.className("title"));
        String labelValue = productLabel.getText();

        if(labelValue.equals("Products")){
            System.out.println("Product label exist");
        }else{
            System.out.println("Product label not found");
        }

        List<WebElement> links = driver.findElements(By.linkText("a"));
        for(WebElement link:links){
            String text = link.getAttribute("href");
            System.out.println("link: "+text);
        }

    }
}
