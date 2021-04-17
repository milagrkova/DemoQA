package com.demoqa.util;

import com.demoqa.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import javax.tools.Tool;
import java.util.concurrent.TimeUnit;


public class Global {

    public WebDriver driver;
    public WebDriverWait wait;
    public final int TIMEOUT = 10;
    public TextBoxPage textBoxPage;
    public CheckBoxPage checkBoxPage;
    public PractiseFormPage practiseFormPage;
    public SliderPage sliderPage;
    public AccordianPage accordianPage;
    public AutoCompletePage autoCompletePage;
    public DatePickerPage datePickerPage;
    public MenuPage menuPage;
    public TabsPage tabsPage;
    public ToolTipsPage toolTipPage;
    public SelectMenuPage selectMenuPage;
    public SelectablePage selectablePage;
    public DragAndDropPage dragAndDropPage;
    public ResizablePage resizablePage;

//    @Parameters({"browserName"})
    @BeforeMethod
//    public void setUp(String browserName){

//        switch (browserName){
//            case "CHROME":
//                System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver");
//                driver = new ChromeDriver();
//                break;
//            case "FIREFOX":
//                System.setProperty("webdriver.gecko.driver","src/test/resources/drivers/geckodriver");
//                driver = new FirefoxDriver();
//                break;
//            default:
//                System.out.println("No browser");
//
//        }
    public void setUp(){

        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver5");
        driver = new ChromeDriver();
//        driver = new SafariDriver();
        wait = new WebDriverWait(driver,TIMEOUT);
        driver.manage().window().maximize();
        textBoxPage = new TextBoxPage(driver, wait);
        checkBoxPage = new CheckBoxPage(driver,wait);
        practiseFormPage = new PractiseFormPage(driver,wait);
        sliderPage = new SliderPage(driver,wait);
        accordianPage = new AccordianPage(driver, wait);
        autoCompletePage = new AutoCompletePage(driver, wait);
        datePickerPage = new DatePickerPage(driver, wait);
        menuPage = new MenuPage(driver,wait);
        tabsPage = new TabsPage(driver,wait);
        toolTipPage = new ToolTipsPage(driver,wait);
        selectMenuPage = new SelectMenuPage(driver, wait);
        selectablePage = new SelectablePage(driver, wait);
        dragAndDropPage = new DragAndDropPage(driver, wait);
        resizablePage = new ResizablePage(driver, wait);






    }

    @AfterMethod
    public  void tearDown() throws InterruptedException {

        TimeUnit.SECONDS.sleep(3);
//        driver.quit();
    }
}
