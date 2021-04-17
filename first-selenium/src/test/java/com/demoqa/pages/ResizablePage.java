package com.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResizablePage {

    private WebDriver driver;
    private WebDriverWait wait;

    public ResizablePage(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    public void navigateToPage(String url)
    {
        driver.get(url);
    }

    public void resize()
    {
        WebElement resizeElement = driver.findElement(By.className("react-resizable-handle-se"));

        Actions actionsResize = new Actions(driver);

        //provide the x and y offset values
        actionsResize.dragAndDropBy(resizeElement, 50, 50).perform();

        System.out.println("Done Resizing");
    }

}


