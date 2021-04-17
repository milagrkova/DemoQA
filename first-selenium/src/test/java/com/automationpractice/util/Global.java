package com.automationpractice.util;

import com.demoqa.pages.CheckBoxPage;
import com.demoqa.pages.PractiseFormPage;
import com.demoqa.pages.TextBoxPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

    public class Global {
        public WebDriver driver;
        public WebDriverWait wait;
        public final int TIMEOUT = 10;
        public TextBoxPage textBoxPage;
        public CheckBoxPage checkBoxPage;
        public PractiseFormPage practiseFormPage;

        @Parameters({"browserName"})
        @BeforeMethod
        public void setUp(String browserName){

            switch (browserName){
                case "CHROME":
                    System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver");
                    driver = new ChromeDriver();
                    break;
                case "FIREFOX":
                    System.setProperty("webdriver.gecko.driver","src/test/resources/drivers/geckodriver");
                    driver = new FirefoxDriver();
                    break;
                default:
                    System.out.println("No browser");

            }
            System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver");
            driver = new ChromeDriver();
//        driver = new SafariDriver();
            wait = new WebDriverWait(driver,TIMEOUT);
            driver.manage().window().maximize();
            textBoxPage = new TextBoxPage(driver, wait);
            checkBoxPage = new CheckBoxPage(driver,wait);
            practiseFormPage = new PractiseFormPage(driver,wait);

        }

        @AfterMethod
        public  void tearDown() throws InterruptedException {

            TimeUnit.SECONDS.sleep(3);
            driver.quit();
        }
    }


