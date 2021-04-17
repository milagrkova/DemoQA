package com.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.ListIterator;

public class SelectablePage {

    private WebDriver driver;
    private WebDriverWait wait;
//  By test = By.xpath("//*[@id=\"verticalListContainer\"]/li[1]");
    By list = By.className("mt-2");
    By grid = By.xpath("//*[@id=\"row1\"]/li[1]");
    By gridButton = By.id("demo-tab-grid");

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

    }

    public void selectFirstElementInGrid()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(gridButton)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(grid)).click();
//        List<WebElement> lista = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(grid));
//        lista.get(i-1).click();

    }

}
