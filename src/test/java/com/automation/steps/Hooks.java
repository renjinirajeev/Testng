package com.automation.steps;

import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public class Hooks {
    WebDriver driver;
    @Before
    public void setUp() throws MalformedURLException {
        ConfigReader.initconfig();
        DriverManager.createDriver();
        System.out.println("Before Scenario");
    }

    @After
    public void tearDown(){
        System.out.println("After Scenario");
    }
}
