package com.rishabh.base;

import com.rishabh.utilities.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

    public WebDriver driver;

    ConfigReader configReader;

    @BeforeMethod
    public void setup() {

        configReader = new ConfigReader();

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();

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