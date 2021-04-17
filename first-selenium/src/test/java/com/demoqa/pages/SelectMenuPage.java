package com.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SelectMenuPage {

    private WebDriver driver;
    private WebDriverWait wait;
    By value = By.className("css-1wy0on6");
    By selectValue = By.id("react-select-2-option-1-0");
    By one = By.id("selectOne");
    By selectOne = By.xpath("//div[@id='react-select-3-option-0-3']");
    By color = By.id("oldSelectMenu");
    By selectColor = By.xpath("//*[@id=\"oldSelectMenu\"]/option[9]");
    By cars = By.id("cars");
//    By multiselectDropDown = By.id();
//    By selectAnything = By.id("react-select-4-option-0");

    public SelectMenuPage(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    public void navigateToSelectMenuPage (String url){
        driver.get(url);
    }

    public void testCaseSelectMenu(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(value)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectValue)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(one)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectOne)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(color)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectColor)).click();
//        List<WebElement> elements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(cars));
//        elements.selectByValue(carValue);
//        System.out.println(elements);
//        elements.get(0).click();
        WebElement mySelectElement = driver.findElement(cars);
        Select dropdown= new Select(mySelectElement);
        dropdown.selectByIndex(0);
        dropdown.selectByIndex(1);
        dropdown.selectByIndex(2);
        dropdown.selectByIndex(3);
        dropdown.deselectAll();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(multiselectDropDown)).click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(selectAnything)).click();

//        WebElement mySelectElementDD = driver.findElement(multiselectDropDown);
//        Select multiDropdown= new Select(mySelectElementDD);
//        dropdown.selectByIndex(0);
//        dropdown.selectByIndex(1);
//        dropdown.selectByIndex(2);
//        dropdown.selectByIndex(3);
//        dropdown.deselectAll();
    }

}
