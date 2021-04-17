package com.demoqa.tests;

import com.demoqa.util.Global;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PractiseFormTest extends Global {

    String url = "https://demoqa.com/automation-practice-form";
    String name = "Mila";
    String surname = "Grkova";
    String email = "testiramila@gmail.com";
    int mNum = 07523237676;
//    int mNum = 1028472766;
    String sub = "comp";
    String address = "Ivan cankar";

    @Test
    public void positiveTestCasePractiseForm()
    {
        practiseFormPage.navigateToPractiseFormPage(url);
        practiseFormPage.enterName(name);
        practiseFormPage.enterLastName(surname);
        practiseFormPage.enterEmail(email);
        practiseFormPage.chooseGender();
        practiseFormPage.enterMobilePhone(mNum);
        practiseFormPage.selectYear(87);
        practiseFormPage.selectMonth(4);
        practiseFormPage.selectDay(13);
        practiseFormPage.chooseSubject(sub);
        practiseFormPage.checkBoxes(4);
        practiseFormPage.uploadPicture();
        practiseFormPage.enterCurrentAddress(address);
        practiseFormPage.selectState();
        practiseFormPage.selectCity();
        practiseFormPage.scrollDown();
        practiseFormPage.clickSubmit();
        practiseFormPage.testSubmitForm();
    }

}
