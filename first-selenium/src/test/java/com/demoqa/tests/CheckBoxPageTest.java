package com.demoqa.tests;

import com.demoqa.util.Global;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CheckBoxPageTest extends Global {

    String url = "https://demoqa.com/checkbox";


    @Test
    public void testCaseCheckBoxPositive(){

        checkBoxPage.navigateToCheckBoxPage(url);
        checkBoxPage.expendHomeButton();
        checkBoxPage.checkAllButtons();
        checkBoxPage.expendAllButtons();

    }

}




