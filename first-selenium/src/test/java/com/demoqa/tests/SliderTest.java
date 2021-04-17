package com.demoqa.tests;

import com.demoqa.util.Global;
import org.testng.annotations.Test;

public class SliderTest extends Global {

    String url = "https://demoqa.com/slider";
    int maxNum = 100;
    int minNum = 1;


    @Test
    public void testCaseSlider(){

        sliderPage.navigateToPage(url);
        sliderPage.slider1();

    }
}
