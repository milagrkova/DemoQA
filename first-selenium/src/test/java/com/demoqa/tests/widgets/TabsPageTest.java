package com.demoqa.tests.widgets;

import com.demoqa.util.Global;
import org.testng.annotations.Test;

public class TabsPageTest extends Global {
    String url = "https://demoqa.com/tabs";

    @Test
    public void testTabs(){
        tabsPage.navigateToTabsPage(url);
        tabsPage.clickTabs();
    }
}
