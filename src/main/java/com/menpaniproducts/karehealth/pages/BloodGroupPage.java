package com.menpaniproducts.karehealth.pages;

import com.menpaniproducts.karehealth.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BloodGroupPage extends Utility {
    private static final Logger log = LogManager.getLogger(BloodGroupPage.class.getName());//creation of log method

    public BloodGroupPage() {
        PageFactory.initElements(driver, this);//call page factory class
    }
    @CacheLookup//to store element and memory to run test quicker
    @FindBy(xpath = "//tbody/tr[1]/td[5]/div[1]/a[1]")//locator , with FindBy- find element from web
    WebElement verticalEllipsis;//object name

    @CacheLookup//to store element and memory to run test quicker
    @FindBy(xpath = "//tbody/tr[1]/td[5]/div[1]/ul[1]/li[1]/a[1]")//locator , with FindBy- find element from web
    WebElement editBtn;//object name

    @CacheLookup//to store element and memory to run test quicker
    @FindBy(xpath = "//div[@class='col-md-8']//button[@class='btn btn-primary']")//locator , with FindBy- find element from web
    WebElement submitBtn;//object name

    @CacheLookup//to store element and memory to run test quicker
    @FindBy(xpath = "//h4[normalize-space()='Permission denied']")//locator , with FindBy- find element from web
    WebElement verifyText;//object name

    public void clickOnVerticalEllipsis(){
        mouseHoverAndClickOnElement(verticalEllipsis);
        log.info("MouseHoverAndClicking on loginLink "+ verticalEllipsis.toString());
    }
    public void clickOnEditLink() {//method creation - this method mouse hoover and click on SearchBar
        mouseHoverAndClickOnElement(editBtn);
        log.info("MouseHoverAndClick on edit btn: " + editBtn);
    }
    public void clickOnSubmitBtn() {//method creation - this method mouse hoover and click on SearchBar
        mouseHoverAndClickOnElement(submitBtn);
        log.info("MouseHoverAndClick on submit btn: " + submitBtn);
    }

    public String getVerifyText() {// this method creation of verifying text
        String message = getTextFromElement(verifyText);
        log.info("Getting text from : " + verifyText.toString());
        return message;
    }
}
