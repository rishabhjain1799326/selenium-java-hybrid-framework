package com.rishabh.dataProviders;

import org.testng.annotations.DataProvider;

public class TestDataProvider {

    @DataProvider(name = "loginData")

    public Object[][] getData() {

        return new Object[][] {

                {"test1@gmail.com", "pass1"},

                // {"test2@gmail.com", "pass2"}
        };
    }
}