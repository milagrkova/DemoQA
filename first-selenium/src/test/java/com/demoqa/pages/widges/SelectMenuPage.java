package com.demoqa.pages.widges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

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
    SoftAssert softassert = new SoftAssert();

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

        WebElement mySelectElement = driver.findElement(cars);
        Select dropdown= new Select(mySelectElement);
        dropdown.selectByIndex(0);
        dropdown.selectByIndex(1);
        dropdown.selectByIndex(2);
        dropdown.selectByIndex(3);
        dropdown.deselectAll();

    }

    public void assertSelectMenu(){
        String selectValue = driver.findElement(By.className("css-1uccc91-singleValue")).getText();
        System.out.println(selectValue);
        softassert.assertEquals(selectValue, "Group 2, option 1");

        String selectOne = driver.findElement(By.xpath("//*[@id=\"selectOne\"]/div/div[1]/div[1]")).getText();
        System.out.println(selectOne);
        softassert.assertEquals(selectOne, "Ms.");

        String oldStyleSelectMenu = driver.findElement(By.xpath("//*[@id=\"oldSelectMenu\"]/option[9]")).getText();
        System.out.println(oldStyleSelectMenu);
        softassert.assertEquals(oldStyleSelectMenu, "Indigo");

        softassert.assertAll();
    }
}
