package com.demoqa.tests;

import com.demoqa.util.Global;
import org.testng.annotations.Test;

public class ResizablePageTest extends Global {

    String url = "https://demoqa.com/resizable";

    @Test
    public void testResizablePage(){
        resizablePage.navigateToPage(url);
        resizablePage.resize();
    }
}
