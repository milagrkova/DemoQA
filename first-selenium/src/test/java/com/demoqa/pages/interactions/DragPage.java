package com.demoqa.pages.interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class DragPage {
    private WebDriver driver;
    private WebDriverWait wait;
    By dragButton = By.id("draggableExample-tab-axisRestriction");
    By restrictedX = By.id("restrictedX");
    By restrictedY = By.id("restrictedY");
    SoftAssert softassert = new SoftAssert();
    By preventPropagation = By.id("draggableExample-tab-containerRestriction");
    By containedBox = By.className("ui-widget-content");
    By containedParent = By.className("ui-widget-header");


    public DragPage(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    public void navigateToDragPage (String url){
        driver.get(url);
    }

    public void axisRestricted(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(dragButton)).click();
        WebElement X = driver.findElement(restrictedX);
        WebElement Y = driver.findElement(restrictedY);
        Actions act = new Actions(driver);
        act.dragAndDropBy(X,259, 117).build().perform();
        act.dragAndDropBy(Y,29, 11).build().perform();

    }

    public void containerRestriction(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(preventPropagation)).click();
        WebElement Box = driver.findElement(containedBox);
        WebElement Parent = driver.findElement(containedParent);
        Actions act = new Actions(driver);
        act.dragAndDropBy(Box,150, 60).build().perform();
        act.dragAndDropBy(Parent,30, 600).build().perform();
    }
}
