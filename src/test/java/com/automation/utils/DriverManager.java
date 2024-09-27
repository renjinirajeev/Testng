package com.automation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class DriverManager {

    static WebDriver driver;

    public static void createDriver() throws MalformedURLException {

//        if(ConfigReader.getConfigValue("platform").equals("local")){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
//        }else{
//            ChromeOptions browserOptions = new ChromeOptions();
//            browserOptions.setPlatformName("Windows 11");
//            browserOptions.setBrowserVersion("latest");
//            Map<String, Object> sauceOptions = new HashMap<>();
//            sauceOptions.put("username", "renjini_rs");
//            sauceOptions.put("accessKey", "708ad6f5-c628-4713-909c-194cf40a74db");
//            sauceOptions.put("build", "selenium-build-ZYNXS");
//            sauceOptions.put("name", "Login Test");
//            browserOptions.setCapability("sauce:options", sauceOptions);
//
//            URL url = new URL("https://ondemand.us-west-1.saucelabs.com:443/wd/hub");
//             driver = new RemoteWebDriver(url, browserOptions);

//        }

    }

    public static WebDriver getDriver() {
        return driver;
    }
}
