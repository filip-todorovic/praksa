package com.pages;

import com.webdriver.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PostmanTutorialPage extends BasePage {

    public PostmanTutorialPage(){
        super(WebDriverFactory.getDriver());
    }

    public PostmanTutorialPage(WebDriver driver){
        super(driver);
    }

    public PostmanTutorialPage opensAs(String url){
        log.debug("openAs()");
        driver.get(url);
        return this;
    }


    public String validatePageTitle(){
        return driver.getTitle();
    }

}
