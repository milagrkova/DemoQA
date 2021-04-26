package com.demoqa.pages.interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class DragAndDropPage {
    private WebDriver driver;
    private WebDriverWait wait;
    By drag = By.id("draggable");
    By drop = By.id("droppable");
    By notAcceptableDrag = By.id("notAcceptable");
    By acceptButton = By.id("droppableExample-tab-accept");
    By preventPropagationButton = By.id("droppableExample-tab-preventPropogation");
    By preventDrag = By.id("dragBox");
    By outerDroppable = By.id("notGreedyDropBox");
    SoftAssert softassert = new SoftAssert();

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

        String textTo = Drop.getText();
        softassert.assertEquals(textTo, "Dropped!");
        softassert.assertAll();
    }

    public void notAcceptableDragAndDrop(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(acceptButton)).click();
        WebElement Drag = driver.findElement(notAcceptableDrag);
        WebElement Drop = driver.findElement(drop);
        Actions act = new Actions(driver);
        act.dragAndDrop(Drag, Drop).build().perform();

        String textTo = Drop.getText();

        if (textTo.equals("Dropped!"))
        {
            System.out.println("PASS: Source is dropped at location as expected");
        }
        else
            {
            System.out.println("FAIL: Source couldn't be dropped at location as expected");
            }
    }

    public void preventPropagation(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(preventPropagationButton)).click();
        WebElement Drag = driver.findElement(preventDrag);
        WebElement OuterDrop = driver.findElement(outerDroppable);
        Actions act = new Actions(driver);
        act.dragAndDropBy(Drag,298, 2).build().perform();

        String text = OuterDrop.getText();
        System.out.println(text);

        softassert.assertEquals(text, "Dropped!\n" + "Inner droppable (not greedy)");
        softassert.assertAll();
    }
}
