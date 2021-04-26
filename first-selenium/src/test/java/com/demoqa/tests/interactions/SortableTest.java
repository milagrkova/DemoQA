package com.demoqa.tests.interactions;

import com.demoqa.util.Global;
import org.testng.annotations.Test;

public class SortableTest extends Global {

    String url = "https://demoqa.com/sortable";

    @Test
    public void testDragAndDropPage(){
        sortablePage.navigateToDragAndDropPage(url);
        sortablePage.changeOneAndTwo();
        sortablePage.changeFirstAndLast();
    }
}
