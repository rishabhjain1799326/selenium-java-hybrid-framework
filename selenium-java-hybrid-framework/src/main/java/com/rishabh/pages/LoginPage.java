package com.rishabh.pages;

import com.rishabh.utilities.waitutils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;

    waitutils waitUtils;

    public LoginPage(WebDriver driver) {

        this.driver = driver;

        waitUtils = new waitutils(driver);
    }

    By emailField = By.id("Email");

    By passwordField = By.id("Password");

    By loginButton =
            By.xpath("//button[text()='Log in']");

    public void enterEmail(String email) {

        WebElement element =
                driver.findElement(emailField);

        waitUtils.waitForElement(element);

        element.sendKeys(email);
    }

    public void enterPassword(String password) {

        driver.findElement(passwordField)
                .sendKeys(password);
    }

    public void clickLoginButton() {

        driver.findElement(loginButton)
                .click();
    }
}