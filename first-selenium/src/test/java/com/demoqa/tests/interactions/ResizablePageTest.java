package com.demoqa.tests.interactions;

import com.demoqa.util.Global;
import org.testng.annotations.Test;

public class ResizablePageTest extends Global {

    String url = "https://demoqa.com/resizable";

    @Test
    public void testResizablePage() throws InterruptedException {
        resizablePage.navigateToPage(url);
        resizablePage.resize();
    }
}
