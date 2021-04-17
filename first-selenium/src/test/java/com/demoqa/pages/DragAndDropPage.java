package com.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.print.attribute.standard.Destination;
import javax.xml.transform.SourceLocator;

public class DragAndDropPage {

    private WebDriver driver;
    private WebDriverWait wait;
    By drag = By.id("draggable");
    By drop = By.id("droppable");
    By notAcceptableDrag = By.id("notAcceptable");
    By acceptButton = By.id("droppableExample-tab-accept");





    public DragAndDropPage(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    public void navigateToDragAndDropPage (String url){
        driver.get(url);
    }

    public void simpleDragAndDrop(){

        WebElement Drag = driver.findElement(drag);
        WebElement Drop = driver.findElement(drop);
        Actions act = new Actions(driver);
        act.dragAndDrop(Drag, Drop).build().perform();
        /*WebElement resizeElement = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));

        Actions actionsResize = new Actions(driver);

        //provide the x and y offset values
        actionsResize.dragAndDropBy(resizeElement, 100, 50).perform();

        System.out.println("Done Resizing");*/
    }

    public void notAcceptableDragAndDrop(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(acceptButton)).click();
        WebElement Drag = driver.findElement(notAcceptableDrag);
        WebElement Drop = driver.findElement(drop);
        Actions act = new Actions(driver);
        act.dragAndDrop(Drag, Drop).build().perform();

    }
}
