package com.demoqa.pages;

import com.demoqa.util.Global;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;
import java.util.List;

public class AutoCompletePage {

    private WebDriver driver;
    private WebDriverWait wait;
    By allColoursField = By.id("autoCompleteMultipleInput");
    By singleColor = By.id("autoCompleteSingleInput");


    public AutoCompletePage(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    public void navigateToAutoCompletePage (String url){
        driver.get(url);
    }

    public void multipleColorNames(String[] colors){

        WebElement allColors = wait.until(ExpectedConditions.visibilityOfElementLocated(allColoursField));

        for (int i=0; i<colors.length; i++)
        {
            allColors.sendKeys(colors[i]);
            allColors.sendKeys(Keys.ENTER);
        }
    }

    public void singleColorName(String color){
        WebElement singleColour = wait.until(ExpectedConditions.visibilityOfElementLocated(singleColor));
        singleColour.sendKeys(color);
        singleColour.sendKeys(Keys.ENTER);
    }



}
