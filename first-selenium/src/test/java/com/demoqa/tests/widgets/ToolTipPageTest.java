package com.demoqa.tests.widgets;

import com.demoqa.util.Global;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ToolTipPageTest extends Global {
    String url = "https://demoqa.com/tool-tips";
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void testTooltIp()
    {
        toolTipPage.navigateToToolTipsPage(url);
        toolTipPage.hoverMeToSee();
    }
}
