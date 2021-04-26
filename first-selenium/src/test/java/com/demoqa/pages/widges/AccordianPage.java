package com.demoqa.pages.widges;

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
        String secondQuestion = driver.findElement(By.id("section2Heading")).getText();
        String secondAnswer = driver.findElement(By.id("section2Content")).getText();
        softassert.assertEquals(secondQuestion, "Where does it come from?");
        softassert.assertEquals(secondAnswer, "Contrary to popular belief, Lorem Ipsum is not simply random text." +
                " It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard" +
                " McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure " +
                "Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical" +
                " literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of" +
                " \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This" +
                " book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of " +
                "Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.");

        softassert.assertAll();
    }
    public void expendSection3Heading(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(section3Heading)).click();

        String secondQuestion = driver.findElement(By.id("section3Heading")).getText();
        String secondAnswer = driver.findElement(By.id("section3Content")).getText();
        System.out.println(secondAnswer);
        softassert.assertEquals(secondQuestion, "Why do we use it?");
        softassert.assertEquals(secondAnswer, "It is a long established fact that a reader will be distracted " +
                "by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that " +
                "it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here'," +
                " making it look like readable English. Many desktop publishing packages and web page editors now use" +
                " Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites" +
                " still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes" +
                " on purpose (injected humour and the like).");
        softassert.assertAll();
    }
    public void testFirstQuestionandAnswerText(){
        String firstQuestion = driver.findElement(By.id("section1Heading")).getText();
        String firstAnswer = driver.findElement(By.id("section1Content")).getText();
        softassert.assertEquals(firstQuestion, "What is Lorem Ipsum?");
        softassert.assertEquals(firstAnswer, "Lorem Ipsum is simply dummy text of the printing and typesetting" +
                " industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an" +
                " unknown printer took a galley of type and scrambled it to make a type specimen book." +
                " It has survived not only five centuries, but also the leap into electronic typesetting," +
                " remaining essentially unchanged. It was popularised in the 1960s with the release of" +
                " Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software " +
                "like Aldus PageMaker including versions of Lorem Ipsum.");

        softassert.assertAll();
    }
}
