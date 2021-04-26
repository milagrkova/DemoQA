package com.demoqa.pages.widges;

import com.demoqa.util.Global;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.security.Key;
import java.util.List;

public class AutoCompletePage {
    private WebDriver driver;
    private WebDriverWait wait;
    By allColoursField = By.id("autoCompleteMultipleInput");
    By singleColor = By.id("autoCompleteSingleInput");
    By expectedColors = By.className("css-1rhbuit-multiValue");
    SoftAssert softassert = new SoftAssert();

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
            System.out.println("Colors expected: "+colors[i]);
         }

        List<WebElement> actualCol = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(expectedColors));
        actualCol.get(0).getText();
        System.out.println("Element 1: "+actualCol.get(0).getText());
        actualCol.get(1).getText();
        System.out.println("Element 2: "+actualCol.get(1).getText());
        actualCol.get(2).getText();
        System.out.println("Element 3: "+actualCol.get(2).getText());

        softassert.assertEquals(actualCol.get(0).getText(), "Red");
        softassert.assertEquals(actualCol.get(1).getText(), "Green");
        softassert.assertEquals(actualCol.get(2).getText(), "Yellow");
        softassert.assertAll();
    }

    public void singleColorName(String color){
        WebElement singleColour = wait.until(ExpectedConditions.visibilityOfElementLocated(singleColor));
        singleColour.sendKeys(color);
        singleColour.sendKeys(Keys.ENTER);
        String actualColor = driver.findElement(By.xpath("//*[@id=\"autoCompleteSingleContainer\"]/div/div[1]/div[1]")).getText();
        System.out.println(actualColor);
        softassert.assertEquals(actualColor, "Purple");
        softassert.assertAll();
    }
}