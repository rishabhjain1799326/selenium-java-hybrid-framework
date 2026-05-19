package com.rishabh.dataProviders;

import org.testng.annotations.DataProvider;

public class TestDataProvider {

    // @DataProvider(name = "loginData")
    //     public Object[][] getData() {
    //         return new Object[][]{
    //             { Generateemail(), "pass2"}
    //         }; 

    //     }
    @DataProvider(name = "RegisterUserData")
        public Object[][] getRegisterData() {
            return new Object[][]{
                {Generatefirstname(), Generatelastname(), Generateemail(), "pass2"}
            }; 
        }
    
    public String Generatefirstname(){
        return "Rishabh" + System.currentTimeMillis();
    }
    public String Generatelastname(){
        return "Jain" + System.currentTimeMillis();
    }
    public String Generateemail(){
        return "test" + System.currentTimeMillis() + "@gmail.com";
    }
}