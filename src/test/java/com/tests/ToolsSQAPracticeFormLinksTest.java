package com.tests;

import com.pages.ToolsSQAPracticeFormPage;
import com.pages.ToolsSQAPracticeFormPageLinks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToolsSQAPracticeFormLinksTest {


    String aboutTitle = "About Us";
    String contactUsTitle = "Contact US ToolsQA | Lakshay Sharma";
    String testemonialsTitle = "ToolsQA Testimonials";
    String advertisingWithUsTitle = "Advertising With Us on TOOLSQA | Sponsored Post | Banner Ads";


    @Test
    public void aboutPageExistence(){

        ToolsSQAPracticeFormPageLinks toolsSQAPracticeFormPageLinks = new ToolsSQAPracticeFormPageLinks();
        toolsSQAPracticeFormPageLinks.opensAs("https://www.toolsqa.com/automation-practice-form/");
        toolsSQAPracticeFormPageLinks.clickAboutLink();
        String pageTitle = toolsSQAPracticeFormPageLinks.validatePageTitle();
        Assert.assertEquals(aboutTitle,pageTitle);

        toolsSQAPracticeFormPageLinks.quitWebDriver();
    }

    @Test
    public void contactUsPageExistence(){

        ToolsSQAPracticeFormPageLinks toolsSQAPracticeFormPageLinks = new ToolsSQAPracticeFormPageLinks();
        toolsSQAPracticeFormPageLinks.opensAs("https://www.toolsqa.com/automation-practice-form/");
        toolsSQAPracticeFormPageLinks.clickContactUsLink();
        String pageTitle = toolsSQAPracticeFormPageLinks.validatePageTitle();
        Assert.assertEquals(contactUsTitle,pageTitle);

        toolsSQAPracticeFormPageLinks.quitWebDriver();
    }

    @Test
    public void testemonialsPageExistence(){

        ToolsSQAPracticeFormPageLinks toolsSQAPracticeFormPageLinks = new ToolsSQAPracticeFormPageLinks();
        toolsSQAPracticeFormPageLinks.opensAs("https://www.toolsqa.com/automation-practice-form/");
        toolsSQAPracticeFormPageLinks.clickTestemonialLink();
        String pageTitle = toolsSQAPracticeFormPageLinks.validatePageTitle();
        Assert.assertEquals(testemonialsTitle,pageTitle);

        toolsSQAPracticeFormPageLinks.quitWebDriver();
    }

    @Test
    public void advertisingWithUsPageExistence(){

        ToolsSQAPracticeFormPageLinks toolsSQAPracticeFormPageLinks = new ToolsSQAPracticeFormPageLinks();
        toolsSQAPracticeFormPageLinks.opensAs("https://www.toolsqa.com/automation-practice-form/");
        toolsSQAPracticeFormPageLinks.clickAdvertisingWithUsLink();
        String pageTitle = toolsSQAPracticeFormPageLinks.validatePageTitle();
        Assert.assertEquals(advertisingWithUsTitle,pageTitle);

        toolsSQAPracticeFormPageLinks.quitWebDriver();
    }





}
