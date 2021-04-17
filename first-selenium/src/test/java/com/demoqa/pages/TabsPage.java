package com.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TabsPage {

    private WebDriver driver;
    private WebDriverWait wait;
    By what = By.id("demo-tab-what");
    By origin = By.id("demo-tab-origin");
    By use = By.id("demo-tab-use");
    By more = By.id("demo-tab-more");

    public TabsPage(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    public void navigateToTabsPage (String url){
        driver.get(url);
    }

    public void clickTabs(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(origin)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(what)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(use)).click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(more)).click();



    }


}
