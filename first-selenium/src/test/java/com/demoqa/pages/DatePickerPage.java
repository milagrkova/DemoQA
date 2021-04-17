package com.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class DatePickerPage {

    private WebDriver driver;
    private WebDriverWait wait;

    By calendar = By.id("datePickerMonthYearInput");
    By month = By.className("react-datepicker__month-select");
    By year = By.className("react-datepicker__year-select");
    By timeCalendar = By.id("dateAndTimePickerInput");
    By time = By.className("react-datepicker__time-list-item");

    public DatePickerPage(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    public void navigateToAutoCompletePage (String url){
        driver.get(url);
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
    public void selectTime(int time) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(timeCalendar)).click();
        List<WebElement> elements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(this.time));
        elements.get(time-1).click();
    }


}
