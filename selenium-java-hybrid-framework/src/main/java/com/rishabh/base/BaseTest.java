package com.rishabh.base;

import com.rishabh.utilities.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest { // BaseTest class to handle WebDriver setup and teardown

    public WebDriver driver; // WebDriver instance to be used in test classes
         ConfigReader configReader;
     // ConfigReader configReader; //  ConfigReader instance to read configuration properties

    @BeforeMethod // Setup method to initialize WebDriver before each test method
    public void setup() {

       configReader = new ConfigReader(); // Initialize ConfigReader to read properties
        WebDriverManager.chromedriver().setup(); // Setup ChromeDriver using WebDriverManager
        driver = new ChromeDriver(); // Initialize ChromeDriver
        driver.manage().window().maximize(); // Maximize the browser window
        driver.manage().timeouts()
                .implicitlyWait(Duration.ofSeconds(10));

        System.out.println(configReader.getUrl());

        driver.get(configReader.getUrl());
    }

    @AfterMethod
    public void tearDown() {

        if(driver != null) {

            driver.quit();
        }
    }
}