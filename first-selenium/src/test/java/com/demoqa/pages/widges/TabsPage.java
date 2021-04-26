package com.demoqa.pages.widges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class TabsPage {
    private WebDriver driver;
    private WebDriverWait wait;
    By what = By.id("demo-tab-what");
    By origin = By.id("demo-tab-origin");
    By use = By.id("demo-tab-use");
    SoftAssert softassert = new SoftAssert();

    public TabsPage(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    public void navigateToTabsPage (String url){
        driver.get(url);
    }

    public void clickTabs(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(what)).click();
        String whatTab = driver.findElement(By.id("demo-tabpane-what")).getText();
        System.out.println(whatTab);
        softassert.assertEquals(whatTab,
                "Lorem Ipsum is simply dummy text of the printing and typeset" +
                        "ting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s," +
                        " when an unknown printer took a galley of type and scrambled it to make a type specimen book. " +
                        "It has survived not only five centuries, but also the leap into electronic typesetting, remaining" +
                        " essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets conta" +
                        "ining Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker" +
                        " including versions of Lorem Ipsum.\n" +
                        "\n"
        );
        wait.until(ExpectedConditions.visibilityOfElementLocated(origin)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(use)).click();
        softassert.assertAll();

    }
}
