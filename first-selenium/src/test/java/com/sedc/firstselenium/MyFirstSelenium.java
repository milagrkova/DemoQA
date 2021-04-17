package com.sedc.firstselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MyFirstSelenium {
    WebDriver driver;
    WebDriverWait wait;
    By searchField = By.className("search_query");
    By searchButton = By.className("button-search");
    By productList = By.cssSelector("ul.product_list>li");

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,10);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options); - Za da ne se gleda vo pozadina kako otvara*/
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        driver.quit();
    }

    @Test

    public void firstSelenium() throws InterruptedException {

        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
//      driver.findElement(By.id("contact-link")).click();
        driver.findElement(By.name("search_query")).sendKeys("Dress");
        driver.findElement(By.className("button-search"));
        driver.findElement(By.className("btn"));
        driver.findElement(By.className("btn-default")).click();

        if (driver.findElements(By.id("contact123-link")).size() > 0) {
            driver.findElement(By.id("contact-link")).click();
            System.out.println("Elementot e najden");
        } else {
            System.out.println("Elementot ne e najden");
        }
    }

//    @DataProvider(name = "emailAndName")
//    public Object[][] getData(){
//        Object[][] data = {{"asd@gmail.com","Gjoko"}, {"da@gmail.com","Sil"},{"sas@kos.com","Mile"}};
//        return data;
//    }

    @Test(dataProvider = "emailAndName", dataProviderClass = DataProviderClass.class)
    public  void dataProviderTestCase(String email, String name, int age)
    {
        System.out.println("Name is "+name+" and email is "+email+" and age is "+age);
    }

  /*  @Test
    public void testCaseSignIn(){
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.findElement(By.className("login")).click();
        driver.findElement(By.name("email")).sendKeys("testiramila@gmail.com");
        driver.findElement(By.name("passwd")).sendKeys("123456");
        driver.findElement(By.id("SubmitLogin")).click();

    }
*/
    @Test
    public void testCase4(){
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
//        driver.findElement(By.linkText("Contact us")).click();
//        driver.findElement(By.partialLinkText("tact u")).click();
/*        driver.findElement(By.cssSelector("#search_query_top")).sendKeys("shirt");
        driver.findElement(By.cssSelector("input.search_query")).sendKeys(" and pants");
        driver.findElement(By.cssSelector("input[name=search_query]")).sendKeys(" and");
        driver.findElement(By.cssSelector("input[placeholder=Search]")).sendKeys(" and");
        driver.findElement(By.cssSelector("input.search_query[name=search_query]")).sendKeys("dad");
        driver.findElement(By.cssSelector("input#search_query_top[placeholder=\"Search\"]")).sendKeys("123");*/
//        driver.findElement(By.cssSelector("input[id^=search]")).sendKeys("aaa");
//        driver.findElement(By.cssSelector("input[id$=top]")).sendKeys("BBB");
//        driver.findElement(By.cssSelector("input[id*=ery_]")).sendKeys("\b\b\b\b");// \b znaci back, a \n znaci enter
//        driver.findElement(By.cssSelector("ul.sf-menu>li:last-child")).click();
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
//        driver.findElement(By.xpath("input[contains(@class,'-control ac')]")).sendKeys("as");

    }

    @Test
    public void testCase5() {
        driver.get("http://automationpractice.com/index.php");
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchField)).sendKeys("shirt");
        wait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();
        List<WebElement> listata = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(productList));
    }

    @Test
    public void testCase6(){
        Assert.assertEquals(3,3);
        Assert.assertTrue(true);
    }

    @Test
    public void testCase7(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(2,3);
        softAssert.assertTrue(false);
        softAssert.assertAll();
    }



}


