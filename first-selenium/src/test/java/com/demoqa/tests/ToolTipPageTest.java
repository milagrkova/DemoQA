package com.demoqa.tests;

import com.demoqa.util.Global;
import org.testng.annotations.Test;

public class ToolTipPageTest extends Global {

    String url = "https://demoqa.com/tool-tips";

    @Test
    public void testTooltIp()
    {
        toolTipPage.navigateToToolTipsPage(url);
        toolTipPage.hoverMeToSee();
    }


}
