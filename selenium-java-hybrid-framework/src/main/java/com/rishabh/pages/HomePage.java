package com.rishabh.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickLogin() {
        driver.findElement(By.className("ico-login")).click();
    }
    public void clickRegister() {
        driver.findElement(By.className("ico-register")).click();
    }

    public void RegisterUserData(String firstname, String lastname, String email, String password) {
        driver.findElement(By.xpath("//input[@id='gender-male']")).click();
        driver.findElement(By.xpath(" //input[@id='FirstName']")).sendKeys(firstname);
        driver.findElement(By.xpath(" //input[@id='LastName']")).sendKeys(lastname);
        driver.findElement(By.xpath(" //input[@id='Email']")).sendKeys(email);
        driver.findElement(By.xpath(" //input[@id='Password']")).sendKeys(password);
        driver.findElement(By.xpath(" //input[@id='ConfirmPassword']")).sendKeys(password);
        driver.findElement(By.xpath(" //input[@id='register-button']")).click();

        // Code to click on Register link



    }
}