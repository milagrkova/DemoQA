package com.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProgressBarPage {

    private WebDriver driver;
    private WebDriverWait wait;
    By progressBar = By.className("progress-bar");

    public ProgressBarPage(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }


}
