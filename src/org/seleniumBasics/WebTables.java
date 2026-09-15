package org.seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebTables {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
     //   Thread.sleep(10000); //Stop the Execution for 2 sec
  //implicit wait [10 sec] --> 2sec --> will not hold the remaining 8 sec will go for next step
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement staticWebTable = driver.findElement(By.xpath("//h2[text()='Static Web Table']"));
        System.out.println("Element present on the text: "+staticWebTable.getText());
        //10*10 = 100 sec
        System.out.println("Next event");

        JavascriptExecutor js =(JavascriptExecutor) driver;

        WebElement nameInputField = driver.findElement(By.id("name"));
        //ElementInterceptedException [SendKeys]
        js.executeScript("arguments[0].style.border='3px solid red';",nameInputField);
        js.executeScript("arguments[0].value='FirstName';",nameInputField);

        WebElement startButton = driver.findElement(By.name("start"));
        js.executeScript("arguments[0].style.border='10px solid yellow';",startButton);
        js.executeScript("arguments[0].click();",startButton);

        WebElement blogger = driver.findElement(By.linkText("Blogger"));
        js.executeScript("arguments[0].style.border='10px solid yellow';",blogger);
//        js.executeScript("arguments[0].scrollIntoView(true);",blogger);

        //Pixel based Scrolling
        js.executeScript("window.scrollBy(0,500);");  //x ,y [scroll down] [-500] scroll up
        Thread.sleep(5000);
        js.executeScript("window.scrollBy(0,-500);");

        /*
        <table>
            <thead>
              <td>   </td> ...</thead>
            <tbody>..
              <tr> .<td>..</td>...</tr>
              <tr> ....</tr>
                .<tbody>
        </table>

         */
        WebElement tableData = driver.findElement(By.xpath("//table[@name=\"BookTable\"]/tbody/tr[3]/td[1]"));
        System.out.println("tableData: "+tableData.getText());

    }
}
