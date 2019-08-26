package com.pages;

import com.webdriver.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ToolsSQAPracticeFormPageLinks extends BasePage {

    @FindBy(xpath="//span[contains(text(), 'Tutorial')]")
    WebElement tutorialDropDown;

    @FindBy(xpath="//span[contains(text(), 'API Testing Tools')]")
    WebElement apiTestingTools;

    @FindBy(xpath="//span[contains(text(), 'Postman Tutorial')]")
    WebElement postmanTutorial;

    @FindBy(xpath="//span[contains(text(),'RESTAPI Automation Testing with Rest Assured')]")
    WebElement restAssuredTutorial;

    @FindBy(xpath="//span[contains(text(),'ABOUT')]")
    WebElement aboutButton;

    @FindBy(xpath="//span[contains(text(),'About')]")
    WebElement aboutDropDown;

    @FindBy(xpath="//span[contains(text(),'Contact Us')]")
    WebElement contactUsDropDown;

    @FindBy(xpath="//span[contains(text(),'Testimonial')]")
    WebElement testemonialDropDown;

    @FindBy(xpath="//span[contains(text(),'Advertising With Us')]")
    WebElement advertisingWithUsDropDown;

    Actions actions = new Actions(driver);



    public ToolsSQAPracticeFormPageLinks(){
        super(WebDriverFactory.getDriver());
    }

    public ToolsSQAPracticeFormPageLinks(WebDriver driver){
        super(driver);
    }

    public ToolsSQAPracticeFormPageLinks opensAs(String url){
        log.debug("openAs()");
        driver.get(url);
        return this;
    }

    public ToolsSQAPracticeFormPageLinks clickAboutLink(){
        actions.moveToElement(aboutButton).moveToElement(aboutDropDown).click().build().perform();
        return this;
    }

    public ToolsSQAPracticeFormPageLinks clickContactUsLink(){
        actions.moveToElement(aboutButton).moveToElement(contactUsDropDown).click().build().perform();
        return this;
    }

    public ToolsSQAPracticeFormPageLinks clickTestemonialLink(){
        actions.moveToElement(aboutButton).moveToElement(testemonialDropDown).click().build().perform();
        return this;
    }

    public ToolsSQAPracticeFormPageLinks clickAdvertisingWithUsLink(){
        actions.moveToElement(aboutButton).moveToElement(advertisingWithUsDropDown).click().build().perform();
        return this;
    }


    public String validatePageTitle(){
        return driver.getTitle();
    }



}
