package com.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.webdriver.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ToolsSQAPracticeFormPage extends BasePage {

    //Locators
    @FindBy(name="firstname")
    WebElement inputName;

    @FindBy(id="lastname")
    WebElement inputLastName;

    @FindBy(xpath="//div[@class = 'wpb_text_column wpb_content_element ']/div/h1[contains(text(), 'Practice Automation Form')]")
    WebElement titleTextElement;

    @FindBy(id="datepicker")
    WebElement  inputDate;

    @FindBy(id="photo")
    WebElement uploadFile;

    @FindBy(id="sex-0")
    WebElement maleRadioButton;

    @FindBy(id="sex-1")
    WebElement femaleRadioButton;

    @FindBy(id="profession-0")
    WebElement manualCheckBox;

    @FindBy(id="profession-1")
    WebElement automationCheckBox;

    @FindBy(id="exp-3")
    WebElement threeYearsExperience;

    @FindBy(id="continents")
    WebElement continents;

    @FindBy(xpath="//span[contains(text(), 'Tutorial')]")
    WebElement tutorialDropDown;

    @FindBy(xpath="//span[contains(text(), 'API Testing Tools')]")
    WebElement apiTestingTools;

    @FindBy(xpath="//span[contains(text(), 'Postman Tutorial')]")
    WebElement postmanTutorial;

    @FindBy(xpath="//span[contains(text(),'RESTAPI Automation Testing with Rest Assured')]")
    WebElement restAssuredTutorial;

    Actions actions = new Actions(driver);



    public ToolsSQAPracticeFormPage(){
        super(WebDriverFactory.getDriver());
    }

    public ToolsSQAPracticeFormPage(WebDriver driver){
        super(driver);
    }

    public ToolsSQAPracticeFormPage opensAs(String url){
        log.debug("openAs()");
        driver.get(url);
        return this;
    }



    //Actions
    public void checkTitle() {
        log.debug("checkTitle()");
        Assert.assertEquals(titleTextElement.getText(),"Practice Automation Form");
    }


    public ToolsSQAPracticeFormPage typeFirstName(String name){
        log.debug("typeFirstName()");
        waitForElementToBeVisible(inputName);
        inputName.clear();
        inputName.sendKeys(name);
        return this;
    }

    public ToolsSQAPracticeFormPage typeLastName(String lastName){
        log.debug("typeLastName()");
        waitForElementToBeVisible(inputLastName);
        inputLastName.clear();
        inputLastName.sendKeys(lastName);
        return this;
    }

    public ToolsSQAPracticeFormPage clickMaleRadioButton(){
        waitForElementToBeVisible(maleRadioButton);
        actions.moveToElement(maleRadioButton).click().build().perform();
        maleRadioButton.click();
        return this;
    }

    public ToolsSQAPracticeFormPage clickFemaleRadioButton(){
        waitForElementToBeVisible(femaleRadioButton);
        actions.moveToElement(femaleRadioButton).click().build().perform();
        femaleRadioButton.click();
        return this;
    }

    public ToolsSQAPracticeFormPage manualCheckBox(){
        waitForElementToBeVisible(manualCheckBox);
        actions.moveToElement(manualCheckBox).click().build().perform();
        manualCheckBox.click();
        return this;
    }

    public ToolsSQAPracticeFormPage automationCheckBox(){
        waitForElementToBeVisible(automationCheckBox);
        actions.moveToElement(automationCheckBox).click().build().perform();
        waitForElementToBeVisible(automationCheckBox);
        automationCheckBox.click();
        return this;
    }

    public ToolsSQAPracticeFormPage uploadPhoto(String path){
        waitForElementToBeVisible(uploadFile);
     // actions.moveToElement(uploadFile).click().build().perform();
        uploadFile.sendKeys(path);
        return this;
    }

    public ToolsSQAPracticeFormPage threeYearsExperienceButton(){
        waitForElementToBeVisible(threeYearsExperience);
        actions.moveToElement(threeYearsExperience).click().build().perform();
        threeYearsExperience.click();
        return this;
    }

    public ToolsSQAPracticeFormPage selectionContinent(String continent){
        Select oSelect = new Select(continents);
        oSelect.selectByVisibleText(continent);
        return this;
    }

    public ToolsSQAPracticeFormPage typeDate(String date){
        log.debug("typeDate()");
        waitForElementToBeVisible(inputDate);
        inputDate.clear();
        inputDate.sendKeys(date);
        return this;
    }

    public ToolsSQAPracticeFormPage clickPostmanTutorial(){
        actions.moveToElement(tutorialDropDown).moveToElement(apiTestingTools).moveToElement(postmanTutorial).click().build().perform();
        return this;
    }

    public ToolsSQAPracticeFormPage clickRestAssuredTutorial(){
        actions.moveToElement(tutorialDropDown).moveToElement(apiTestingTools).moveToElement(restAssuredTutorial).click().build().perform();
        return this;
    }

    public String validatePageTitle(){
        return driver.getTitle();
    }






}
