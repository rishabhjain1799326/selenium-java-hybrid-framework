package com.rishabh.dataProviders;

import org.testng.annotations.DataProvider;

public class TestDataProvider {

    @DataProvider(name = "loginData")

    public Object[][] getData() {

        return new Object[][]{

            {"Rishabh","Jain", "test2@gmail.com", "pass2"}
        }; 
    }
}