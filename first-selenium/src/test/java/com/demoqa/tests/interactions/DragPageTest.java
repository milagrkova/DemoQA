package com.demoqa.tests.interactions;

import com.demoqa.util.Global;
import org.testng.annotations.Test;

public class DragPageTest extends Global {

    String url = "https://demoqa.com/dragabble";

    @Test
    public void testDragPage(){
        dragPage.navigateToDragPage(url);
        dragPage.axisRestricted();
        dragPage.containerRestriction();
    }
}
