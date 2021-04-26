package com.demoqa.pages.interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class SortablePage {
    private WebDriver driver;
    private WebDriverWait wait;

    By one = By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[1]");
    By two = By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[2]");
    By oneGrid = By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[1]");
    By nineGrid = By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[9]");

    SoftAssert softassert = new SoftAssert();

    public SortablePage(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    public void navigateToDragAndDropPage (String url){
        driver.get(url);
    }

    public void changeOneAndTwo(){

        WebElement One = driver.findElement(one);
        WebElement Two = driver.findElement(two);
        Actions act = new Actions(driver);
        act.dragAndDrop(One, Two).build().perform();

        String secondElement = Two.getText();
        System.out.println(secondElement);
        softassert.assertEquals(secondElement, "One");
        softassert.assertAll();
    }

    public void changeFirstAndLast(){
        By gridButton = By.id("demo-tab-grid");
        wait.until(ExpectedConditions.visibilityOfElementLocated(gridButton)).click();
        WebElement One = driver.findElement(oneGrid);
        WebElement Nine = driver.findElement(nineGrid);
        Actions act = new Actions(driver);
        act.dragAndDrop(One, Nine).build().perform();

        String lastElement = Nine.getText();
        System.out.println(lastElement);
        softassert.assertEquals(lastElement, "One");
        softassert.assertAll();
    }
}
