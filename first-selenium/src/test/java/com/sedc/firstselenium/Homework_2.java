package com.sedc.firstselenium;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Homework_2 {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test
    public void testRunnersMk(){

        driver.get("https://www.google.mk/");
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("runners.mk");
        driver.findElement(By.className("gNO89b")).click();
        driver.findElement(By.xpath("//*[contains(@class,'LC20lb DKV0Md')]")).click();
        driver.findElement(By.name("search")).sendKeys("patiki");
        driver.findElement(By.name("submit_search")).click();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.findElement(By.id("list-view")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/a[2]")).click();//Allow cookies
        driver.findElement(By.xpath("//*[@id=\"products\"]/div/div[1]/div[1]/div/div[2]/div[3]/div[1]/a")).sendKeys(Keys.ENTER);
        driver.findElement(By.className("mfp-close")).click();
        driver.quit();

    }

}
