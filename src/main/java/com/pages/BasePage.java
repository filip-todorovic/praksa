package com.pages;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected WebDriver driver = null;

    protected static Log log = LogFactory.getLog(BasePage.class);

    public BasePage(WebDriver driver){

        this.driver=driver;
        driver.manage().window().maximize();
        log = LogFactory.getLog(this.getClass());// ovde ga stavljas da bi mogli svi da ga koriste
        PageFactory.initElements(driver,this);// sve varijable se refresh pri novom pozivu, uzima
        // naziv varijable i to trazi po strani
    }

    public BasePage waitForElementToBeVisible(WebElement webElement){

        log.debug("waitForElementToBeVisible()");
        try{
            WebDriverWait wait = new WebDriverWait(driver,2);
            wait.until(ExpectedConditions.visibilityOf(webElement));
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

        return this;

    }

    public void quitWebDriver(){
        log.debug("quitWebDriver()");
        if (driver != null){
            driver.quit();
        }
    }

}
