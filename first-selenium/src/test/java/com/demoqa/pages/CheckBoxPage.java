package com.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CheckBoxPage {

    private WebDriver driver;
    private WebDriverWait wait;
    By checkDesktop = By.className("rct-checkbox");
    By expendHome = By.className("rct-collapse-btn");
    By expendAll = By.className("rct-collapse");

    public CheckBoxPage(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }
    public void navigateToCheckBoxPage(String url){
        driver.get(url);
    }


    public void expendHomeButton(){
    wait.until(ExpectedConditions.visibilityOfElementLocated(expendHome)).click();

    }

    public void expendAllButtons(){
        List<WebElement> listaExpend = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(expendAll));
        listaExpend.get(0).click();
        listaExpend.get(1).click();
        listaExpend.get(2).click();
    }
    /*
    public void checkDesktopButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkDesktop)).click();
    }
    public void expandDesktopButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(expandDesktop)).click();
    }*/



    public void checkAllButtons(){ //postojat poveke elementi od taa klasa i mi vika daj mu na vrednost na toj element. Od ista klasa deka se, moze lista
        List<WebElement> lista = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(checkDesktop));
        lista.get(0).click();
//        lista.get(1).click();
//        lista.get(2).click();
//        lista.get(3).click();
    }





}


