package com.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class AccordianPage {

    private WebDriver driver;
    private WebDriverWait wait;
    By section2Heading = By.id("section2Heading");
    By section3Heading = By.id("section3Heading");
    SoftAssert softassert = new SoftAssert();

    public AccordianPage(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    public void navigateToAccordianPage (String url){
        driver.get(url);
    }

    public void expendSection2Heading(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(section2Heading)).click();
    }
    public void expendSection3Heading(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(section3Heading)).click();
    }
    public void testFirstQuestionandAnswerText(){
        String firstQuestion = driver.findElement(By.id("section1Heading")).getText();
        String firstAnswer = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div/div[1]/div[2]/div/p/text()")).getText();
        softassert.assertEquals(firstQuestion, "What is Lorem Ipsum?");
        softassert.assertEquals(firstAnswer, "Lorem Ipsum is simply dummy text of the printing and typesetting" +
                " industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an" +
                " unknown printer took a galley of type and scrambled it to make a type specimen book." +
                " It has survived not only five centuries, but also the leap into electronic typesetting," +
                " remaining essentially unchanged. It was popularised in the 1960s with the release of" +
                " Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software " +
                "like Aldus PageMaker including versions of Lorem Ipsum.");


    }
}
