package com.saucedemo.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// This class will store all locators and methods of login page
public class LoginPage {

    WebDriver driver;
    By username = By.id("user-name");
    By password = By.id("password");
    By loginButton = By.xpath("//input[@value='Login']");

    //    Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //    Methods
    public void typeUsername(String user) {
        driver.findElement(username).sendKeys(user);
    }

    public void typePassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public void clickOnLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void loginToSauceDemo(String userid, String passPhrase) {
        driver.findElement(username).sendKeys(userid);
        driver.findElement(password).sendKeys(passPhrase);
        driver.findElement(loginButton).click();
    }


}
