package com.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class TextBoxPage {

    public By resultName = By.id("name");
    public By getResultEmail = By.id("email");

    private WebDriver driver;
    private WebDriverWait wait;
    By username = By.id("userName");
    By useremail = By.id("userEmail");
    By currentaddress = By.id("currentAddress");
    By permanentaddress = By.id("permanentAddress");
    By submit = By.id("submit");
    SoftAssert softAssert = new SoftAssert();

    public TextBoxPage(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    public void navigateToPage(String url){
        driver.get(url);
    }

    public void enterName(String name){
    wait.until(ExpectedConditions.visibilityOfElementLocated(username)).sendKeys(name);
    }

    public void enterEmail(String email){
        wait.until(ExpectedConditions.visibilityOfElementLocated(useremail)).sendKeys(email);
    }

    public void enterCurrentAddress(String address){
        driver.findElement(currentaddress).sendKeys(address);
    }

    public void enterPermanentAddress(String permanentAddress){
        driver.findElement(permanentaddress).sendKeys(permanentAddress);
    }
 /*   public void checkName1(String name){
        Assert.assertEquals("Name:" + name, driver.findElement(TextBoxPage.resultName).getText());
    } */
    public void enterSubmit(){
        driver.findElement(submit).click();
    }


}
