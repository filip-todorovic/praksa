package com.pages;

import com.webdriver.WebDriverFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class ToolsSQAPracticeSwitchWindowsPage extends BasePage {

    @FindBy(xpath ="//button[contains(text(),'New Message Window')]")
    WebElement newMessageWindow;

    @FindBy(id ="alert")
    WebElement alertBox;

    Actions actions = new Actions(driver);

    public ToolsSQAPracticeSwitchWindowsPage(){
        super(WebDriverFactory.getDriver());
    }

    public ToolsSQAPracticeSwitchWindowsPage(WebDriver driver){
        super(driver);
    }

    public ToolsSQAPracticeSwitchWindowsPage opensAs(String url){
        log.debug("openAs()");
        driver.get(url);
        return this;
    }

    public void clickNewMessageWindow(){

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String handle = driver.getWindowHandle();
        System.out.println(handle);
        newMessageWindow.click();
        Set handles = driver.getWindowHandles();
        System.out.println(handles);
        for(String handle1 : driver.getWindowHandles()){
            System.out.println(handle1);
            driver.switchTo().window(handle1);
        }

    }


    public void clickAlertBox(){

        try {
            WebDriverWait wait = new WebDriverWait(driver, 2);
            wait.until(ExpectedConditions.alertIsPresent());
            Alert simpleAlert = driver.switchTo().alert();
            simpleAlert.accept();
        } catch (Exception e) {
            //exception handling
        }
    }



}
