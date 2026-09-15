package org.seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsOfWebDriver {

    //upcasting
    /*  className objRefName = new ClassName();
    Assigning the child class object to Parent class referance Name - Upcasting
   ParentClassName objRefName = new ChildClassName();
    case 1: objRefName --> allows to access only the parent class methods and variable
    Case 2: when the both class hold the same method and arguments [Child class method will override the parent class]
     */

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        String title = driver.getTitle();
        System.out.println("title: "+title);

        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl: "+currentUrl);

        String pageSource = driver.getPageSource();
        System.out.println("pageSource; "+pageSource);

        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        String titleOne = driver.getTitle();
        System.out.println("naviagte to: "+titleOne);
        driver.navigate().back();
        String titleTwo = driver.getTitle();
        System.out.println("naviagte back: "+titleTwo);
        driver.navigate().forward();
        String titleThree = driver.getTitle();
        System.out.println("naviagte forward: "+titleThree);

        driver.navigate().refresh();

        driver.close();  //current tab or window
        //driver.quit(); //more than one tab or window
    }
}
