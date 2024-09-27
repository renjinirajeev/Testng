package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {


    @FindBy(id = "user-name")
    WebElement userInput;

    @FindBy(id = "password")
    WebElement passwordInput;

    @FindBy(id = "login-button")
    WebElement signInBtn;

    public void openWebsite() {
        driver.get("https://www.saucedemo.com/");
    }

    public void doLogin(String username, String password) {
        userInput.sendKeys("standard_user");
        passwordInput.sendKeys("secret_sauce");
        signInBtn.click();
    }

    public boolean isLoginPageDisplayed() {
        return userInput.isDisplayed() && passwordInput.isDisplayed();
    }
}
