package com.demoqa.tests.interactions;

import com.demoqa.util.Global;
import org.testng.annotations.Test;

public class SelectablePageTest extends Global {

    String url = "https://demoqa.com/selectable";

    @Test
    public void testSelectablePage(){
        selectablePage.navigateToSelectablePage(url);
        selectablePage.selectAllElementsInList();
        selectablePage.selectFirstElementInGrid();
    }
}
