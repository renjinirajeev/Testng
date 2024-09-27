
package com.automation.test;

import com.automation.utils.DriverManager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class ExtentReportListener implements ITestListener {

    private static ExtentReports extentReports;
    public static ExtentTest test;

    public void onFinish(ITestContext context) {
        extentReports.flush();
    }

    public void onStart(ITestContext context) {
        String path = System.getProperty("user.dir") + "\\extentReports\\extentReport.html";
        extentReports = new ExtentReports();
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(path);
        sparkReporter.config().setTheme(Theme.DARK);
        extentReports.attachReporter(sparkReporter);
    }

    public void onTestStart(ITestResult result) {
        test = extentReports.createTest("testCreated");
    }

    public void onTestSuccess(ITestResult result) {
        test.pass("Passed");
    }

    public void onTestFailure(ITestResult result) {
        test.fail("Failed");
    }

    public void onTestSkipped(ITestResult result) {
        test.skip("Skipped");
    }



}







