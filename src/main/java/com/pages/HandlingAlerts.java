package com.pages;

import com.webdriver.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HandlingAlerts extends BasePage{

    @FindBy(xpath="//button[contains(text(),'Simple Alert')]")
    WebElement simpleAlert;

    @FindBy(xpath="//button[contains(text(),'Confirm Pop up')]")
    WebElement confirmPopUp;

    @FindBy(xpath="//button[contains(text(),'Prompt Pop up')]")
    WebElement promptPopUp;

    @FindBy(id="ConfirmOption")
    WebElement confirmOption;


    Actions actions = new Actions(driver);

    public HandlingAlerts(){
        super(WebDriverFactory.getDriver());
    }

    public HandlingAlerts(WebDriver driver){
        super(driver);
    }

    public HandlingAlerts opensAs(String url){
        log.debug("openAs()");
        driver.get(url);
        return this;
    }

    public void clickSimpleAlert(){
        try {
            WebDriverWait wait = new WebDriverWait(driver, 2);
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            alert.accept();

        } catch (Exception e) {
            //exception handling
        }
    }

    public void clickConfirmationAlertOk(){

        ((JavascriptExecutor) driver).executeScript("arguments[0].click()",confirmPopUp);
        Alert confirmationAlert = driver.switchTo().alert();
        confirmationAlert.accept();

    }

    public void clickConfirmationAlertCancel(){

        ((JavascriptExecutor) driver).executeScript("arguments[0].click()",confirmPopUp);
        Alert confirmationAlert = driver.switchTo().alert();
        confirmationAlert.dismiss();


    }

    public void confirmationAlertOk() {

        Assert.assertEquals(confirmOption.getText(),"You have clicked on OK");


    }

    public void confirmationAlertCancel(){

        Assert.assertEquals(confirmOption.getText(),"You have clicked on Cancel");


    }

    public void popUpAlert() throws InterruptedException {

        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", promptPopUp);
        Alert promptAlert  = driver.switchTo().alert();
        promptAlert .sendKeys("Accepting the alert");
      //  Thread.sleep(4000); //This sleep is not necessary, just for demonstration
        promptAlert .accept();

    }







}
