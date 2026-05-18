package com.rishabh.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {

        this.driver = driver;
    }

    By loginLink = By.className("ico-login");

    public void clickLogin() {

        driver.findElement(loginLink).click();
    }
}