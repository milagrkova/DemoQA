package com.sedc.firstselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Homework_1 {

    /*In the class, create a test method that will do the following:
* In chrome browser go to https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp
* Locate fields and sendkeys:
- ‘First name’ by finding element via ID
- ‘Last Name’ by finding element via Name
- ‘User name’ by finding element via Class name

* Exit the browser session.

*/

    WebDriver driver;

   @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void Exercise1(){
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
        driver.findElement(By.id("firstName")).sendKeys("Mile");
        driver.findElement(By.name("lastName")).sendKeys("Stankovic");
        driver.findElement(By.className("whsOnd"));
        driver.findElement(By.className("zHQkBf")).sendKeys("mile.stankovic");
        driver.quit();
    }
}
