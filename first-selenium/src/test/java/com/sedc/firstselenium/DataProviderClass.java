package com.sedc.firstselenium;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

    @DataProvider(name = "emailAndName")
    public Object[][] getData(){
        Object[][] data = {{"asd@gmail.com","Gjoko", 23}, {"da@gmail.com","Sil",23},{"sas@kos.com","Mile",32}};
        return data;
    }
}
