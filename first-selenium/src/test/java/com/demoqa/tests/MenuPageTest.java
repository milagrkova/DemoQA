package com.demoqa.tests;

import com.demoqa.util.Global;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MenuPageTest extends Global {

    String url = "https://demoqa.com/menu#";

    @Test
    public void testMenuPagePositive(){
        menuPage.navigateToMenuPage(url);
        menuPage.menuHover();
    }
}
