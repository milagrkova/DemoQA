package com.demoqa.tests;

import com.demoqa.util.Global;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TextBoxPageTest extends Global {

    String url = "https://demoqa.com/text-box";
    String name = "Mila";
    String email = "testiramila@gmail.com";
    String address = "Ivan Cankar";
    String permanentAddress = "Stevo Filipovik 2/4-17";
    
    @Test
    public void testCase1(){
        textBoxPage.navigateToPage(url);
        textBoxPage.enterName(name);
        textBoxPage.enterEmail(email);
        textBoxPage.enterCurrentAddress(address);
        textBoxPage.enterPermanentAddress(permanentAddress);
        textBoxPage.enterSubmit();

        String actualResult = name;
        String expectedResult = "Mila";
        Assert.assertEquals(actualResult,expectedResult);




    }


}
