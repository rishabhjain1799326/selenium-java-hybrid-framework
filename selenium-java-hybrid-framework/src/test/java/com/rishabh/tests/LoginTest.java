package com.rishabh.tests;

import com.rishabh.base.BaseTest;
import com.rishabh.dataProviders.TestDataProvider;
import com.rishabh.pages.HomePage;
import com.rishabh.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test(dataProvider = "loginData",
            dataProviderClass =
                    TestDataProvider.class)

    public void verifyLoginFlow(
        String firstname,
        String lastname,
        String email,
        String password) {

        HomePage homePage = new HomePage(driver);
        homePage.clickRegister(firstname, lastname, email, password); 
        homePage.clickLogin(); 
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
    }
}