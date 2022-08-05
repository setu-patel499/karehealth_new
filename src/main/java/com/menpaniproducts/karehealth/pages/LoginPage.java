package com.menpaniproducts.karehealth.pages;

import com.menpaniproducts.karehealth.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());//creation of log method

    public LoginPage() {
        PageFactory.initElements(driver, this);//call page factory class
    }

    @CacheLookup//to store element and memory to run test quicker
    @FindBy(xpath = "//body/div[1]/div[2]/form[1]/div[1]/input[1]")//locator , with FindBy- find element from web
    WebElement username;//object name

    @CacheLookup//to store element and memory to run test quicker
    @FindBy(xpath = "//body/div[1]/div[2]/form[1]/div[2]/input[1]")//locator , with FindBy- find element from web
    WebElement password;//object name

    @CacheLookup//to store element and memory to run test quicker
    @FindBy(xpath = "//button[contains(text(),'Login')]")//locator , with FindBy- find element from web
    WebElement loginBtn;//object name

    public void enterUsername(String Username){
        sendTextToElement(username,Username);
        log.info("Enter username "+username+ " to username field "+username.toString());
    }
    public void enterPassword(String pass){
        sendTextToElement(password, pass);
        log.info("Enter Password "+pass+ " to email field "+password.toString());
    }
    public void clickOnLoginBtn(){
        clickOnElement(loginBtn);
        log.info("Clicking on loginLink "+ loginBtn.toString());
    }
}