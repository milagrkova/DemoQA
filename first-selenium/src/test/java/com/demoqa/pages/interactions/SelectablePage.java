package com.demoqa.pages.interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.ListIterator;

public class SelectablePage {

    private WebDriver driver;
    private WebDriverWait wait;

    By list = By.className("mt-2");
    By grid = By.xpath("//*[@id=\"row1\"]/li[1]");
    By gridButton = By.id("demo-tab-grid");
    SoftAssert softassert = new SoftAssert();

    public SelectablePage(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    public void navigateToSelectablePage (String url){
        driver.get(url);
    }

    public void selectAllElementsInList()
    {
        List<WebElement> lista = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(list));
        lista.get(0).click();
        lista.get(1).click();
        lista.get(2).click();

        String textTo0 = lista.get(0).getText();
        softassert.assertEquals(textTo0, "Cras justo odio");
        String textTo1 = lista.get(1).getText();
        softassert.assertEquals(textTo1, "Dapibus ac facilisis in");
    }
    
    public void selectFirstElementInGrid()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(gridButton)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(grid)).click();

        Boolean Display = driver.findElement(By.className("active")).isDisplayed();
        System.out.println("Element displayed is :"+Display);
    }
}
