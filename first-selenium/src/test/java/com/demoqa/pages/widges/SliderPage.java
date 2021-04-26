package com.demoqa.pages.widges;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class SliderPage {
    private static WebDriver driver;
    private WebDriverWait wait;
    SoftAssert softassert = new SoftAssert();

    public SliderPage(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    public void navigateToPage(String url){
        driver.get(url);
    }

        public void slider1() {

           WebElement slideElement = driver.findElement(By.xpath("//*[@id=\"sliderContainer\"]/div[1]/span/input"));
           Dimension sliderWidth = slideElement.getSize();
           System.out.println(sliderWidth);
           Actions actionsSlide = new Actions(driver);
           actionsSlide.dragAndDropBy(slideElement, 424, 0).perform();

           WebElement sliderValueField = driver.findElement(By.id("sliderValue"));
           String sliderValue = sliderValueField.getAttribute("value");
           System.out.println(sliderValue);
           softassert.assertEquals(sliderValue, "100");
           softassert.assertAll();
    }
}


