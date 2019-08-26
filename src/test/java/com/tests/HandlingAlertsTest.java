package com.tests;

import com.pages.HandlingAlerts;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class HandlingAlertsTest {

    @Test
    public void clickSimpleAlert(){
        HandlingAlerts handlingAlerts = new HandlingAlerts();
        handlingAlerts.opensAs("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
        handlingAlerts.clickSimpleAlert();
        handlingAlerts.quitWebDriver();

    }

    @Test
    public void confirmationAlertTestOk() throws InterruptedException{
        HandlingAlerts handlingAlerts = new HandlingAlerts();
        handlingAlerts.opensAs("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
        handlingAlerts.clickConfirmationAlertOk();
        Thread.sleep(2000);
        Assert.assertEquals(handlingAlerts.getConfirmOption().getText(),"You have clicked on OK");
     // handlingAlerts.confirmationAlertOk();
        handlingAlerts.quitWebDriver();
    }

    @Test
    public void confirmationAlertTestCancel() throws InterruptedException{
        HandlingAlerts handlingAlerts = new HandlingAlerts();
        handlingAlerts.opensAs("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
        handlingAlerts.clickConfirmationAlertCancel();
        Assert.assertEquals(handlingAlerts.getConfirmOption().getText(),"You have clicked on Cancel");
     // handlingAlerts.confirmationAlertCancel();
        handlingAlerts.quitWebDriver();
    }

    @Test
    public void popUpAlert() throws InterruptedException{
        HandlingAlerts handlingAlerts = new HandlingAlerts();
        handlingAlerts.opensAs("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
        handlingAlerts.popUpAlert();
        handlingAlerts.quitWebDriver();
    }





}
