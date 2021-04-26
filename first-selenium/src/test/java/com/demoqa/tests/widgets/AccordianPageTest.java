package com.demoqa.tests.widgets;

import com.demoqa.util.Global;
import org.testng.annotations.Test;

public class AccordianPageTest extends Global {

    String url = "https://demoqa.com/accordian";

    @Test
    public void testCaseAccordianPagePositive(){
    accordianPage.navigateToAccordianPage(url);
    accordianPage.testFirstQuestionandAnswerText();
    accordianPage.expendSection2Heading();
    accordianPage.expendSection3Heading();
    }
}
