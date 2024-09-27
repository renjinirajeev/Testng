package com.automation.test;

import com.automation.utils.ConfigReader;
import com.aventstack.extentreports.ExtentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.automation.test.ExtentReportListener.*;
//

public class LoginTest extends BaseTest {

    @Test
    public void verifyUserCanLoginValidCredentials() throws IOException {

        loginPage.openWebsite();
        loginPage.doLogin(ConfigReader.getConfigValue("login.username"), ConfigReader.getConfigValue("login.password"));
//        test.addScreenCaptureFromPath(takeScreenShoot());
        test.addScreenCaptureFromPath(takeScreenShot());

        Assert.assertTrue(homePage.isHomePageDisplayed(), "homepage is not loaded properly");

    }

    @Test
    public void verifyUserCanLogout() {

        loginPage.openWebsite();
        loginPage.doLogin(ConfigReader.getConfigValue("login.username"), ConfigReader.getConfigValue("login.password"));
        Assert.assertTrue(homePage.isHomePageDisplayed(), "homepage is not loaded properly");

        homePage.clickOnBurgerMenu();
        homePage.clickOnLogOutLink();
        Assert.assertTrue(loginPage.isLoginPageDisplayed(), "loginpage is not loaded properly");
    }

    @Test
    public void verifyProductAddToCart() {
        loginPage.openWebsite();
        loginPage.doLogin(ConfigReader.getConfigValue("login.username"), ConfigReader.getConfigValue("login.password"));
        Assert.assertTrue(homePage.isHomePageDisplayed(), "homepage is not loaded properly");

        homePage.clickAddToCart();
        Assert.assertEquals(homePage.isCartPageDisplayed(), "Remove");
//        Assert.assertTrue(homePage.isCartPageDisplayed(),"product is not added to cart");
    }

    @Test
    public void verifyProductRemoveFromCart() throws IOException {
        loginPage.openWebsite();
        loginPage.doLogin(ConfigReader.getConfigValue("login.username"), ConfigReader.getConfigValue("login.password"));
        Assert.assertTrue(homePage.isHomePageDisplayed(), "homepage is not loaded properly");

        homePage.clickAddToCart();
        homePage.removeFromCart();
        if(!homePage.removeProductFromCart().equals("Add to carttf")){
//            test.addScreenCaptureFromPath(takeScreenShoot());

        }
        Assert.assertEquals(homePage.removeProductFromCart(), "Add to cartded");
    }
}

