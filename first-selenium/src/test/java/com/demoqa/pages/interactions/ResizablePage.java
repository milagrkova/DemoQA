package com.demoqa.pages.interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class ResizablePage {
    private WebDriver driver;
    private WebDriverWait wait;
    SoftAssert softassert = new SoftAssert();

    public ResizablePage(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    public void navigateToPage(String url)
    {
        driver.get(url);
    }

    public void resize() throws InterruptedException {
        WebElement resizeElement = driver.findElement(By.className("react-resizable-handle-se"));
        Actions actionsResize = new Actions(driver);
        //provide the x and y offset values
        actionsResize.dragAndDropBy(resizeElement, 10, 10).perform();

        WebElement resized = driver.findElement(By.id("resizableBoxWithRestriction"));
        TimeUnit.SECONDS.sleep(10);
        Dimension resizedElement = resized.getSize();
        System.out.println(resizedElement);
        softassert.assertEquals(resizedElement, "(210, 210)");
        softassert.assertAll();
    }
}


