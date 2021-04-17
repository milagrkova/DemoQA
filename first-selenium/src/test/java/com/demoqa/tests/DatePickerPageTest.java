package com.demoqa.tests;

import com.demoqa.util.Global;
import org.testng.annotations.Test;

public class DatePickerPageTest extends Global {

    String url = "https://demoqa.com/date-picker";
    int year = 1;
    int month = 05;
    int day = 16;
    int time = 5;


    @Test
    public void testCaseAutoCompletePagePositive(){

        datePickerPage.navigateToAutoCompletePage(url);
        datePickerPage.selectMonth(month);
        datePickerPage.selectYear(year);
        datePickerPage.selectDay(day);
        datePickerPage.selectTime(time);

    }
}
