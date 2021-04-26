package com.demoqa.tests.interactions;

import com.demoqa.util.Global;
import org.testng.annotations.Test;

public class DragAndDropTest extends Global {
    String url = "https://demoqa.com/droppable";

    @Test
    public void testDragAndDropPage(){

    dragAndDropPage.navigateToDragAndDropPage(url);
    dragAndDropPage.simpleDragAndDrop();
    dragAndDropPage.notAcceptableDragAndDrop();
    dragAndDropPage.preventPropagation();
    }
}
