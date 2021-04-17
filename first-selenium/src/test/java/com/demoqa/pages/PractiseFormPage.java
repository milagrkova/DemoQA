package com.demoqa.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class PractiseFormPage {

    private WebDriver driver;
    private WebDriverWait wait;

    By firstName = By.id("firstName");
    By lastName = By.id("lastName");
    By gender = By.className("custom-control-label");
    By phoneNum = By.id("userNumber");
    By emailAdress = By.id("userEmail");
    By subject = By.xpath("//*[@id=\"subjectsInput\"]");
    By hobby = By.className("custom-control-inline");
    By submit = By.id("submit");
    By uploadPic = By.id("uploadPicture");
    By calendar = By.id("dateOfBirthInput");
    By month = By.className("react-datepicker__month-select");
    By year = By.className("react-datepicker__year-select");
    By currentAddress = By.xpath("//*[@id=\"currentAddress\"]");
    By stateNCR = By.id("react-select-3-option-0");
    By stateDropDown = By.xpath("//*[@id=\"state\"]/div/div[2]/div");
    By cityDropDown = By.xpath("//*[@id=\"city\"]/div/div[2]/div");
    By cityNoida = By.id("react-select-4-option-2");
    SoftAssert softassert = new SoftAssert();


    public PractiseFormPage(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    public void navigateToPractiseFormPage(String url){
        driver.get(url);
    }

    public void enterName(String name){
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstName)).sendKeys(name);
    }
    public void enterLastName(String surname){
        wait.until(ExpectedConditions.visibilityOfElementLocated(lastName)).sendKeys(surname);
    }

    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
    }
    public void chooseGender(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(gender)).click();
    }
    public void enterMobilePhone(int mNum)
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(phoneNum)).sendKeys(String.valueOf(mNum));
    }
    public void enterEmail(String email){
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailAdress)).sendKeys(email);
    }
    public void chooseSubject(String sub){

        WebElement subjects = wait.until(ExpectedConditions.visibilityOfElementLocated(subject));
        subjects.sendKeys(sub);
        subjects.sendKeys(Keys.ENTER);
    }

    public void clickSubmit()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(submit)).click();
    }
    public void checkBoxes(int i) {
        List<WebElement> elements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(hobby));
        elements.get(i-1).click();
    }

        public void selectMonth(int month) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(calendar)).click();
            Select select = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(this.month)));
            select.selectByIndex(month);
        }
        public void selectYear(int year) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(calendar)).click();
            Select select = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(this.year)));
            select.selectByIndex(year);
        }
        public void selectDay(int day) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(calendar)).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.react-datepicker__day--0" + day))).click();
            //react-datepicker__day--001
        }


    public void uploadPicture(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(uploadPic)).sendKeys("/Users/mgrkova/Desktop/1.png");
    }
    public void enterCurrentAddress(String address){
        wait.until(ExpectedConditions.visibilityOfElementLocated(currentAddress)).sendKeys(address);
    }

    public void selectState(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(stateDropDown)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(stateNCR)).click();
    }
    public void selectCity(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(cityDropDown)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(cityNoida)).click();
    }
//    public void selectState(int i) {
//        List<WebElement> elements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(cityDropDown));
//        elements.get(i-1).click();
//    }


    public void testSubmitForm() {
        String actualName = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/table/tbody/tr[1]/td[2]")).getText();
        softassert.assertEquals(actualName, "Mila Grkova");
        String actualEmail = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/table/tbody/tr[2]/td[2]")).getText();
        softassert.assertEquals(actualEmail, "testiramila@gmail.com");
        String actualmNum = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/table/tbody/tr[4]/td[2]")).getText();
        softassert.assertEquals(actualmNum, "0752323767");
        String actualGender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/table/tbody/tr[3]/td[2]")).getText();
        softassert.assertEquals(actualGender, "Male");
        String dOb = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/table/tbody/tr[5]/td[2]")).getText();
        softassert.assertEquals(dOb, "13 May,1987");
        String subject = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/table/tbody/tr[6]/td[2]")).getText();
        softassert.assertEquals(subject, "Computer Science");
        String hobbies = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/table/tbody/tr[7]/td[2]")).getText();
        softassert.assertEquals(hobbies, "Sports");
        String image = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/table/tbody/tr[8]/td[2]")).getText();
        softassert.assertEquals(image, "1.png");
        String address = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/table/tbody/tr[9]/td[2]")).getText();
        softassert.assertEquals(address, "Ivan cankar");
        String city = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/table/tbody/tr[10]/td[2]")).getText();
        softassert.assertEquals(city, "NCR Noida");
        softassert.assertAll();
    }
   /* public void checkIfTheInfoIsCorrect() {
   //*[@id="section1Content"]/p/text()


        String actualName = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/table/tbody/tr[1]/td[2]")).getText();
        Assert.assertEquals(actualName, "Mila Grkova");
        String actualEmail = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/table/tbody/tr[2]/td[2]")).getText();
        Assert.assertEquals(actualEmail, "testiramila@gmail.com");
        String actualmNum = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/table/tbody/tr[4]/td[2]")).getText();
        Assert.assertEquals(actualmNum, "07523237676");
        String actualGender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/table/tbody/tr[3]/td[2]")).getText();
        Assert.assertEquals(actualGender, "Male");
        String dOb = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/table/tbody/tr[5]/td[2]")).getText();
        Assert.assertEquals(dOb, "13 May,1987");
        String subject = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/table/tbody/tr[6]/td[2]")).getText();
        Assert.assertEquals(subject, "Computer Science");
        String hobbies = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/table/tbody/tr[7]/td[2]")).getText();
        Assert.assertEquals(hobbies, "Sports");
        String image = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/table/tbody/tr[8]/td[2]")).getText();
        Assert.assertEquals(image, "1.png");
        String address = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/table/tbody/tr[9]/td[2]")).getText();
        Assert.assertEquals(address, "Ivan cankar");
        String city = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/table/tbody/tr[10]/td[2]")).getText();
        Assert.assertEquals(city, "NCR Noidwa");
    }*/


    /*
     Angelina:
        public void checkBoxes() {
        List<WebElement> checkAll = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(checkboxes));
        for (WebElement check : checkAll) {
            if (!check.isSelected()) {
                check.click();
            }
        }
    }
    */

    /*
    Gjoko:
    *  public void selectHobbies(int i) {
        List<WebElement> elements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(checkBoxHobbies));
        elements.get(i-1).click();
    }
from tester academy2 to Everyone:    7:37  PM
        formsPage.selectHobbies(1);
        formsPage.selectHobbies(2);
    */



}
