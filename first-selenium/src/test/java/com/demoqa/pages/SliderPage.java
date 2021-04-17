package com.demoqa.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SliderPage {

    private static WebDriver driver;
    private WebDriverWait wait;

    

    public SliderPage(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    public void navigateToPage(String url){
        driver.get(url);
    }

 

        public static void slider(){
            int x=2;
            WebElement slider = driver.findElement(By.xpath("//*[@id=\"sliderContainer\"]/div[1]/span/input"));
            int width=slider.getSize().getWidth();
            System.out.println(width);
            Actions move = new Actions(driver);
//            move.moveToElement(slider, ((width*x)/100), 0).click();
            move.moveToElement(slider, x, 0).click();
            move.build().perform();
            System.out.println("Slider moved");
        }
        public static void slider1() {

           WebElement slideElement = driver.findElement(By.xpath("//*[@id=\"sliderContainer\"]/div[1]/span/input"));

           Actions actionsSlide = new Actions(driver);

           actionsSlide.dragAndDropBy(slideElement, 100, 0).perform();

            System.out.println("Done Sliding");
    }


       /* WebElement slider = wait.until(ExpectedConditions.visibilityOfElementLocated(slide));
        Dimension sliderSize = slider.getSize();
        int sliderWidth = sliderSize.getWidth();
        int xCoord = slider.getLocation().getX();

        Actions builder = new Actions(driver);
        builder.moveToElement(slider)
                .click()
                .dragAndDropBy
                        (slider,xCoord + sliderWidth, 0)
                .build()
                .perform();*/
    }


