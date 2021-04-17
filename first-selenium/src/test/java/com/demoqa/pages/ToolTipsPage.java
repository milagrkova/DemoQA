package com.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToolTipsPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public ToolTipsPage(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    public void navigateToToolTipsPage (String url){
        driver.get(url);
    }

    public void hoverMeToSee(){

        //Instantiate Action Class
        Actions actions = new Actions(driver);
        //Retrieve WebElement 'Music' to perform mouse hover
        WebElement hoverButton = driver.findElement(By.id("toolTipButton"));
        WebElement hoverTextfield = driver.findElement(By.id("toolTipTextField"));
        //Mouse hover menuOption 'Music'
        actions.moveToElement(hoverButton).perform();
        actions.moveToElement(hoverTextfield).perform();

    }



   /* //Instantiate Action Class
    Actions actions = new Actions(driver);
    //Retrieve WebElement 'Music' to perform mouse hover
    WebElement menuOption = driver.findElement(By.xpath(".//div[contains(text(),'Music')]"));
    //Mouse hover menuOption 'Music'
     actions.moveToElement(menuOption).perform();
     System.out.println("Done Mouse hover on 'Music' from Menu");*/
}
