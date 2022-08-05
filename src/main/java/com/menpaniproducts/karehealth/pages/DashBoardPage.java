package com.menpaniproducts.karehealth.pages;

import com.menpaniproducts.karehealth.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage extends Utility {
    private static final Logger log = LogManager.getLogger(DashBoardPage.class.getName());//creation of log method

    public DashBoardPage() {
        PageFactory.initElements(driver, this);//call page factory class
    }
    @CacheLookup//to store element and memory to run test quicker
    @FindBy(xpath = "//body/div[1]/aside[1]/section[1]/ul[1]/li[25]/a[1]/i[1]")//locator , with FindBy- find element from web
    WebElement bloodGroupTab;//object name

    public void clickOnBloodGroupBtn() {//method creation - this method mouse hoover and click on SearchBar
        mouseHoverAndClickOnElement(bloodGroupTab);
        log.info("MouseHoverAndClick on blood group tab: " + bloodGroupTab);
    }

}
