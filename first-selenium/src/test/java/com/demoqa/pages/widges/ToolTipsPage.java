package com.demoqa.pages.widges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class ToolTipsPage {
    private WebDriver driver;
    private WebDriverWait wait;
    SoftAssert softassert = new SoftAssert();

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

        WebElement hoverButton = driver.findElement(By.id("toolTipButton"));
        WebElement hoverTextfield = driver.findElement(By.id("toolTipTextField"));

        actions.moveToElement(hoverButton).perform();
        actions.moveToElement(hoverTextfield).perform();

        Boolean display = driver.findElement(By.xpath("//*[@id=\"toolTipButton\"]")).isDisplayed();
        System.out.println("Element displayed is :"+display);

        WebElement textFieldToolTip = driver.findElement(By.id("toolTipTextField"));
        String textField = textFieldToolTip.getAttribute("aria-describedby");
        System.out.println(textField);

    }
}
