package com.rishabh.tests;

import com.rishabh.base.BaseTest;
import com.rishabh.dataProviders.TestDataProvider;
import com.rishabh.pages.HomePage;
import com.rishabh.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

@Test(// Test method to verify registration flow with provided test data
        dataProvider = "RegisterUserData", // Provide test data for registration flow from TestDataProvider class
            dataProviderClass =
                    TestDataProvider.class) // Specify the data provider class to fetch test data

        public void verifyRegisterFlow(
        String firstname,
        String lastname,
        String email,
        String password) {
        HomePage homePage = new HomePage(driver);
        homePage.clickRegister();
        homePage.RegisterUserData(firstname, lastname, email, password); 
        LoginPage loginPage = new LoginPage(driver); // Create an instance of LoginPage to interact with the login page of the application
        homePage.clickLogin();
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        loginPage.clickLoginButton();
    }

}