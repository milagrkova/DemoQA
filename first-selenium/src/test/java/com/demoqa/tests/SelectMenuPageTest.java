package com.demoqa.tests;

import com.demoqa.util.Global;
import org.testng.annotations.Test;

public class SelectMenuPageTest extends Global {

    String url = "https://demoqa.com/select-menu";

    @Test
    public void testSelectMenu(){

        selectMenuPage.navigateToSelectMenuPage(url);
        selectMenuPage.testCaseSelectMenu();
    }
}
