package com.tests;

import com.pages.PostmanTutorialPage;
import com.pages.ToolsSQAPracticeFormPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ToolsSQAPracticeFormTest  {


    String postmanPageTitle = "Postman Tutorial for Beginners to perform API Testing";
    String restAssuredPageTitle = "Rest Assured Tutorial for REST API Automation Testing";


    @Test
    public void testToolsSQA() throws InterruptedException {

        ToolsSQAPracticeFormPage  toolsSQAPracticeFormPage = new ToolsSQAPracticeFormPage();
        toolsSQAPracticeFormPage.opensAs("https://www.toolsqa.com/automation-practice-form/");
        String expectedText = "Practice Automation Form";
        String name = "Filip";
        String lastName = "Todorovic";
        String date = "22/8/2019";
        String continent = "Europe";
        String photoPath = "C:\\Users\\Filip.Todorovic\\Vezbanje\\src\\test\\java\\picture\\photo-1523895665936-7bfe172b757d.jfif";

        //System.setProperty("webdriver.chrome.driver","C:\\Users\\Filip.Todorovic\\Vezbanje\\src\\main\\resources\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver() ;

        toolsSQAPracticeFormPage.checkTitle();

        toolsSQAPracticeFormPage.typeFirstName(name);

        toolsSQAPracticeFormPage.typeLastName(lastName);

        toolsSQAPracticeFormPage.clickMaleRadioButton();

        toolsSQAPracticeFormPage.typeDate(date);

        toolsSQAPracticeFormPage.automationCheckBox();

        toolsSQAPracticeFormPage.uploadPhoto(photoPath);

        toolsSQAPracticeFormPage.selectionContinent(continent);

        toolsSQAPracticeFormPage.quitWebDriver();


        //driver.quit();

    }

    @Test
    public void testPostmanTutorialPageExistence(){

        ToolsSQAPracticeFormPage  toolsSQAPracticeFormPage = new ToolsSQAPracticeFormPage();
        toolsSQAPracticeFormPage.opensAs("https://www.toolsqa.com/automation-practice-form/");
        toolsSQAPracticeFormPage.clickPostmanTutorial();
        String pageTitle = toolsSQAPracticeFormPage.validatePageTitle();
        Assert.assertEquals(postmanPageTitle,pageTitle);

        toolsSQAPracticeFormPage.quitWebDriver();
    }

    @Test
    public void testRestAsuredTutorialPageExistence(){
        ToolsSQAPracticeFormPage  toolsSQAPracticeFormPage = new ToolsSQAPracticeFormPage();
        toolsSQAPracticeFormPage.opensAs("https://www.toolsqa.com/automation-practice-form/");
        toolsSQAPracticeFormPage.clickRestAssuredTutorial();
        String pageTitle = toolsSQAPracticeFormPage.validatePageTitle();
        Assert.assertEquals(restAssuredPageTitle,pageTitle);

        toolsSQAPracticeFormPage.quitWebDriver();
    }


}
