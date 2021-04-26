package com.demoqa.pages.widges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class MenuPage {
    private WebDriver driver;
    private WebDriverWait wait;
    By menu2 = By.xpath("//*[@id=\"nav\"]/li[2]/a");
    By subSubMenu = By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/a");
    By subSubMenu1 = By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/ul/li[1]/a");
    SoftAssert softassert = new SoftAssert();

    public MenuPage(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    public void navigateToMenuPage (String url){
        driver.get(url);
    }

    public void menuHover (){
        wait.until(ExpectedConditions.visibilityOfElementLocated(menu2)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(subSubMenu)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(subSubMenu1)).click();

        String actualMenu = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/ul/li[2]/a")).getText();
        System.out.println(actualMenu);
        softassert.assertEquals(actualMenu, "Sub Sub Item 2");
        softassert.assertAll();
    }
}
