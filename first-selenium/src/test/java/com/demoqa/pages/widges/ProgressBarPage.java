package com.demoqa.pages.widges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class ProgressBarPage {

    private WebDriver driver;
    private WebDriverWait wait;
    By startStopButton = By.id("startStopButton");
    By progressBar = By.id("progressBar");
    SoftAssert softassert = new SoftAssert();

    public ProgressBarPage(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }
    public void navigateToPage(String url) {
        driver.get(url);
    }

    public void startprogress(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(startStopButton)).click();
    }

    public void moveprogress() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement progressbar = driver.findElement(progressBar);
        progressbar.click();
        TimeUnit.SECONDS.sleep(18);
        String progress = progressbar.getText();
        System.out.println(progress);
        TimeUnit.SECONDS.sleep(18);
        softassert.assertEquals(progress, "100%");
        softassert.assertAll();
    }
}



