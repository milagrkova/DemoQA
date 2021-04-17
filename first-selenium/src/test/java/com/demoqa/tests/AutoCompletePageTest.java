package com.demoqa.tests;

import com.demoqa.util.Global;
import org.testng.annotations.Test;

public class AutoCompletePageTest extends Global {

    String url = "https://demoqa.com/auto-complete";
    String [] colors  = {"red","green","yellow","blue"};
    String color = "purple";
    int year = 2020;
    int month = 06;
    int day = 23;


    @Test
    public void testCaseAutoCompletePagePositive(){

    autoCompletePage.navigateToAutoCompletePage(url);
    autoCompletePage.multipleColorNames(colors);
    autoCompletePage.singleColorName(color);

    }
}
