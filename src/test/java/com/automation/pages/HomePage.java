package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(id = "react-burger-menu-btn")
    WebElement burgerMenuIcon;

    @FindBy(id = "logout_sidebar_link")
    WebElement logOutLink;

    @FindBy(css = ".product_sort_container")
    WebElement filterDropdown;

    @FindBy(css = ".shopping_cart_link")
    WebElement cartIcon;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCart;

    @FindBy(id = "remove-sauce-labs-backpack")
    WebElement RemoveButton;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement removeProductIcon;


//    @FindBy(css="shopping_cart_badge")
//    WebElement cartIconUpdate;


    public void clickOnBurgerMenu() {
        burgerMenuIcon.click();
    }

    public void clickOnLogOutLink() {
        logOutLink.click();
    }

    public boolean isHomePageDisplayed() {
        return filterDropdown.isDisplayed() && cartIcon.isDisplayed();

    }

    public void clickAddToCart() {
        addToCart.click();

    }

//    public boolean  isCartPageDisplayed(){
//        return RemoveButton.isDisplayed();
//    }

    public String isCartPageDisplayed() {
        return RemoveButton.getText();

    }

    public void removeFromCart() {
        RemoveButton.click();
    }

    public String removeProductFromCart() {
        return removeProductIcon.getText();
    }
}

