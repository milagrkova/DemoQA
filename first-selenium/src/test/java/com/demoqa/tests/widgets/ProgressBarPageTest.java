package com.demoqa.tests.widgets;

import com.demoqa.util.Global;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ProgressBarPageTest extends Global {
    String url = "https://demoqa.com/progress-bar";

    @Test
    public void testProgressbar() throws InterruptedException {
        progressBarPage.navigateToPage(url);
        progressBarPage.startprogress();
        progressBarPage.moveprogress();
    }
}
