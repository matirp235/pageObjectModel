package com.saucedemo.Testcases;

import com.saucedemo.Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyLoginSauceDemo {
    @Test
    public void verifyValidLogin() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        LoginPage login = new LoginPage(driver);
//        login.typePassword("standard_user");
//        login.typePassword("secret_sauce");
//        login.clickOnLoginButton();
        login.loginToSauceDemo("standard_user", "secret_sauce");

        driver.quit();
    }
}
