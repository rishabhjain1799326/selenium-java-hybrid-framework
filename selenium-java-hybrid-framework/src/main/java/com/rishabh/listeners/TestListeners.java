package com.rishabh.listeners;

import com.rishabh.base.BaseTest;
import com.rishabh.utilities.ScreenshotUtils;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners extends BaseTest
        implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {

        ScreenshotUtils.captureScreenshot(
                driver,
                result.getName());

        System.out.println(
                "Screenshot captured for failed test");
    }
}